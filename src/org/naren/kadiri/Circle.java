package org.naren.kadiri;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Inside the triangle");
		System.out.println("Center point is (" + center.getX() + "," + center.getY() + ")");
	}
	
	@PostConstruct
	public void initilize() {
		System.out.println("It's a initialize method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("It's a initialize method");
	}
}
