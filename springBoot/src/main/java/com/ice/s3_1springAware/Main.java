package com.ice.s3_1springAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean必须要意识到Spring容器的存在，才能调用Spring所提供的资源，这就是所谓的Spring Aware。
 * 其实Spring Aware本来就是Spring设计用来框架内部使用，若使用了，Spring Aware，你的Bean将会和Spring框架耦合。
 * @ClassName: Main 
 * @Description: TODO 
 * @author: xuqb
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService awareService = context.getBean(AwareService.class);
		awareService.outputResult();
		
		context.close();
	}
}
