package com.rectangle;

import com.shape.Shape;

public class Rectangle extends Shape {
	
	private int length;
    private int breadth;
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth =breadth;
    }
    

	@Override
	public int area() {

		return length*breadth; 
	}

//	@Override
//	protected int area() {
//
//		int length=10;
//		int breadth=20;
//		int area =length*breadth;
//		return area;
//	}
}
