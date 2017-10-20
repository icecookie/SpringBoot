package com.ice.s3_3taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 计划任务（定时器）
 * @ClassName: Main 
 * @Description: TODO 
 * @author: xuqb
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
	}
}
