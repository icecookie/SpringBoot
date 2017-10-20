package com.ice.s1_3aop;

import org.springframework.stereotype.Service;
/**
 * 使用注释的被拦截类
 * @author xuqibin
 */
@Service
public class DemoAnnotationService {
	@Action(name="注释式拦截的add操作")
	public void add() {
		System.out.println("DemoAnnotationService");
	}
}
