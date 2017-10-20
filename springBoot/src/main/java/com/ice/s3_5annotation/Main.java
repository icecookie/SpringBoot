package com.ice.s3_5annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 组合注解与元注解
 * 元注解：可以注解到别的注解上的注解
 * 组合注解：被注解的注解。组合注解具备注解其上的元注解功能
 * “@Configuration”就是一个组合@Component注解，表明这个类其实也是一个Bean
 * @ClassName: Main 
 * @Description: TODO 
 * @author: xuqb
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService demoService = context.getBean(DemoService.class);
		demoService.outputResult();
		context.close();
	}
}
