package com.ice.s3_7fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;
/**
 *\@ActiveProfiles为prod可以通过，为dev不能通过
 * @ClassName: DemoBeanIntegrationTests 
 * @Description: TODO 
 * @author: xuqb
 */
@RunWith(SpringJUnit4ClassRunner.class)//SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能
@ContextConfiguration(classes = {TestConfig.class})//@ContextConfiguration 用来加载配置ApplicationContext，其中classes属性用来加载配置类
@ActiveProfiles("prod")//@ActiveProfiles用来声明活动的profile
public class DemoBeanIntegrationTests {
	@Autowired//可使用普通的@Autowired注入Bean
	private TestBean testBean;
	
	@Test//测试代码，通过JUnit的Assert来校验结果是否和预期一致
	public void prodBeanShouldInject() {
		String expected = "from production profile";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}
}
