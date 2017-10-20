package com.ice.s1_3aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 让一组类共享相同的行为
 * @author xuqibin
 */
public class Main {

	public static void main(String[] args) {
		//使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		//获得声明配置的DemoAnnotationService的Bean
		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		//获得声明配置的DemoMethodService的Bean
		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		demoMethodService.add();
		context.close();
	}

}
