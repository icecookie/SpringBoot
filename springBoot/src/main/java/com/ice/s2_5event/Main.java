package com.ice.s2_5event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: Main 
 * @Description: Spring的事件（Application Event）为Bean与Bean之间的消息通信提供了支持。当一个Bean处理完一个任务后，希望另外一个Bean知道并能做相应的处理，这时我们就需要让另外一个Bean监听当前Bean所发出的事件。 
 * @author: xuqb
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		
		DemoPublisher demoPublisher =  context.getBean(DemoPublisher.class);
		
		demoPublisher.publish("hello application event");
		
		context.close();
	}
}
