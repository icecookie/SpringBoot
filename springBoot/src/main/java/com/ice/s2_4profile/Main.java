package com.ice.s2_4profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Main 
 * @Description: Profile为在不同环境下使用不同的配置提供了支持（开发环境下的配置和生产环境下的配置肯定是不同的，例如，数据库的配置） 
 * @author: xuqb
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("prod");		//1.将活动的Profile设置为prod
		context.register(ProfileConfig.class);					//2.注册Bean配置类，不然会报Bean未定义的错误
		context.refresh();										//3.刷新容器
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean.getContent());
		context.close();
	}

}
