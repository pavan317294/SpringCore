package com.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{
	
	private Point center;

	
	public Point getCenter() {
		return center;
	}

 @Autowired//@Required
 @Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
		System.out.println("Center of circle is: ("+ center.getX()+","+center.getY()+")");
	}
	
}
