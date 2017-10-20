package com.ice.s2_3prepost;
/**
 * @ClassName: BeanWayService 
 * @Description: 使用@Bean形式的Bean
 * @author: xuqb
 */
public class BeanWayService {
	public void init() {
		System.out.println("@Bean-init-method");
	}
	public BeanWayService () {
		super();
		System.out.println("初始化构造函数-BeanWayService");
	}
	public void destroy() {
		System.out.println("@Bean-destory-method");
	}
}
