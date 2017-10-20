package com.ice.s2_5event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName: DemoEvent 
 * @Description: 自定义事件，继承ApplicationEvent
 * @author: xuqb
 */
public class DemoEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public DemoEvent(Object source, String msg) {
		super(source);
		this.setMsg(msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
