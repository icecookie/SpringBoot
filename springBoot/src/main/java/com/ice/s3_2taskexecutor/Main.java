package com.ice.s3_2taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 多线程 强行异步
 * @ClassName: Main 
 * @Description: TODO 
 * @author: xuqb
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		for (int i = 0; i < 10; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
		context.close();
	}
}
