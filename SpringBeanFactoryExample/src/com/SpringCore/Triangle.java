package com.SpringCore;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

//public class Triangle implements InitializingBean, DisposableBean{
	public class Triangle {

private Point pointA;
private Point pointB;
private Point pointC;

	

	public Point getPointA() {
	return pointA;
}

public void setPointA(Point pointA) {
	this.pointA = pointA;
}


	public Point getPointB() {
	return pointB;
}

public void setPointB(Point pointB) {
	this.pointB = pointB;
}

	public Point getPointC() {
	return pointC;
}

public void setPointC(Point pointC) {
	this.pointC = pointC;
}

	public void draw(){
		System.out.println("pointA:(" + getPointA().getX()+","+ getPointA().getY()+")" );
		System.out.println("pointB:(" + getPointB().getX()+","+ getPointB().getY() +")");
		System.out.println("pointC:(" + getPointC().getX()+","+ getPointC().getY() +")");

	}
	
	/*@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initializing bean init() method called from Triangle Bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable bean destroy() method called from Triangle Bean");

	}
*/
	/*public void myInit() {
		System.out.println("Initializing bean myInit() method called from Triangle Bean");
	}
	*/
	public void myCleanup() {
		System.out.println("Destroy bean myCleanup() method called from Triangle Bean");

	}
	
}
