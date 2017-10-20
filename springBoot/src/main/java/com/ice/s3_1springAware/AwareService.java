package com.ice.s3_1springAware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {//实现BeanNameAware、ResourceLoaderAware接口，获得Bean名称和资源加载的服务。

	private String beanName;
	private ResourceLoader loader;
	
	public void setResourceLoader(ResourceLoader resourceLoader) {//实现ResourceLoaderAware需要重写setResourceLoader
		this.loader = resourceLoader;

	}

	public void setBeanName(String name) {//实现BeanNameAware需要重写setBeanName
		this.beanName = name;
	}
	
	public void outputResult() {
		System.out.println("Bean的名称为：" + beanName);
		Resource resource = loader.getResource("classpath:com/ice/s3_1springAware/test.txt");
		try {
			System.out.println("ResourseLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
