package com.ice.s2_3prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * @ClassName: Main 
 * @Description: Bean的初始化和销毁 
 * @author: xuqb
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		//java配置方式：使用@Bean的initMethod和destroyMethod（相当于xml配置的init-method和destroy-method）
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		//注解方式：利用JSR-250的@PostConstruct和@PreDestroy
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		
		context.close();
	}

}
