package com.SpringCore;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{
	
private List<Point> points;
private ApplicationContext context= null;
private String beanName=null;


	public List<Point> getPoints() {
	return points;
}

public void setPoints(List<Point> points) {
	this.points = points;
}

	public void draw(){
		
		for(Point point: points)
		System.out.println("point:(" + point.getX()+","+ point.getY() +")" );

	}

	//while initializing the beans, spring will automatically call right setters 
	//depending on the aware interfaces that you implement. This can be done any no.of 
	//beans in your spring xml as long as bean implements these AWARE interfaces
	//and its going to call setters and pass value that we want. we can have it as 
	//member variables or you can use it in execution. we can have access.
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		
		System.out.println("BeanName:" + beanName);
	}

}
