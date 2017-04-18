package com.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle(); 
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("springbean.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
		context.registerShutdownHook(); //when program ends, the destroy will be called
		/*Triangle triangle = (Triangle) context.getBean("triangle");	
		triangle.draw();*/
		/*
		Circle circle = (Circle)context.getBean("circle");
		circle.draw();*/
		
		/*Shape shape= (Shape)context.getBean("triangle");
		shape.draw();*/
		
		Shape shape= (Shape)context.getBean("circle");
		shape.draw();
	}
	
	

}
