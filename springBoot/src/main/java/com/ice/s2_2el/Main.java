package com.ice.s2_2el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 调用各种资源，包括普通文件，网址，配置文件，系统环境变量，
 * 我们可以使用Spring的表达式语言实现资源的注入。
 */

/**
 * @ClassName: Main 
 * @Description: Spring EL-Spring
 * @author: xuqb
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		
		ElConfig resourceService = context.getBean(ElConfig.class);
		
		resourceService.outputResource();
		
		context.close();
	}
}
