package com.ice.s1_3aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * 配置类
 * @author xuqibin
 */
@Configuration				//声明当前类是一个配置类
@ComponentScan("com.ice.s1_3aop")		//自动扫描aop包名下所有使用@Service,@Component,@Repository和@Controller的类，并注册为Bean
@EnableAspectJAutoProxy		//开启Spring对AspectJ的支持
public class AopConfig {

}
