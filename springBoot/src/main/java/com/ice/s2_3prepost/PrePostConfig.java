package com.ice.s2_3prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ice.s2_3prepost")
public class PrePostConfig {
	
	@Bean(initMethod = "init",destroyMethod = "destroy")		//initMethod和destroyMethod指定BeanWayService类的init和destroy方法在构造函数之后、Bean销毁之前执行
	BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
}
