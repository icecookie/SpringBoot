package com.ice.s1_3aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 编写切面
 * @author xuqibin
 */
@Aspect 		//注解声明一个切面
@Component 	//让此切面成为spring容器管理的bean
public class LogAspect {
	@Pointcut("@annotation(com.ice.s1_3aop.Action)")	//声明切点
	public void annotationPointCut() {};
	
	//基于注释拦截
	//demoAnnotationService.add() --> @Action --> @Pointcut("@annotation(aop.Action)") --> annotationPointCut --> after
	@After("annotationPointCut()")				//声明一个建言，并使用@PointCut定义的切点
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截  " + action.name());	//通过反射可获得注解上的属性，然后做日志记录相关的操作
	}
	
	//基于方法规则拦截
	//在DemoMethodService执行之前
	@Before("execution(* com.ice.s1_3aop.DemoMethodService.*(..))")	//声明一个建言，此建言直接使用拦截规则作为参数(*后面有一个空格)
	public void brfore(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截，" + method.getName());
	}
}
