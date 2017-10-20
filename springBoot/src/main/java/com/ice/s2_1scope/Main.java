package com.ice.s2_1scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Singleton: 一个Spring容器中只有一个Bean的实例，此为Spring的默认配置，全容器共享一个实例
 * Prototype: 每次调用新建一个Bean的实例
 * Request: Web项目中，给每一个http request新建一个Bean实例
 * Session: Web项目中，给每一个http session新建一个Bean实例
 * GlobalSession: 这个只在portal应用中有用，给每个global http session 新建一个实例
 */

/**
 * @ClassName: Main 
 * @Description: TODO 
 * @author: xuqb
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		
		System.out.println("s1与s2是否相等：" + s1.equals(s2));
		System.out.println("p1与p2是否相等：" + p1.equals(p2));
	}

}
