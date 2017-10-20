package com.ice.s2_5event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DemoPublisher 
 * @Description: 事件发布类 
 * @author: xuqb
 */
@Component
public class DemoPublisher {
	@Autowired
	ApplicationContext applicationContext;		//注入ApplicationContext用来发布事件
	
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this, msg));		//使用ApplicationContext的publishEvent方法来发布
	}
}
