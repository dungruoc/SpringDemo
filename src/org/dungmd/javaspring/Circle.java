package org.dungmd.javaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;
	private float radius;
	
	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
        System.out.println("Circle center: " + center.toString() + " - radius: " + radius);
	}

}
