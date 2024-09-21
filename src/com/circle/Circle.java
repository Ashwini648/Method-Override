package com.circle;

import com.shape.Shape;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius) {
        this.radius = radius;
    }
	
	public int area() {
        return (int) (Math.PI* radius * radius);//Pie*rSquare
	}

//	@Override
//	protected int area() {
//		
//		int n=10;
//		int radius=20;
//		int area=n*radius*radius;
//		return area;
//		
//	}
	
}
