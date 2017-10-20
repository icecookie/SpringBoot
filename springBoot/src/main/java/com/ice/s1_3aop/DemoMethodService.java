package com.ice.s1_3aop;

import org.springframework.stereotype.Service;

/**
 * 使用方法规则被拦截类
 * @author xuqibin
 */
@Service
public class DemoMethodService {
	public void add() {
		System.out.println("DemoMethodService");
	}
}
