package com.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp1 {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle(); 
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("springbean.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");	
		triangle.draw();
	}
	
	

}
