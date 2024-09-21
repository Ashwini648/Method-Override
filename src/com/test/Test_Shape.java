package com.test;

import com.circle.Circle;
import com.rectangle.Rectangle;
import com.shape.Shape;

public class Test_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1=new Rectangle(10, 20);
		System.out.println("Area Of Rectangle:");
		System.out.println("length*breadth="+r1.area());

		Circle c1=new Circle(24);
		System.out.println("Area Of Circle:");
		System.out.println("2*radius^2="+c1.area());
		
		System.out.println("       ");
		
		Shape s1=new Rectangle(20,40);
		System.out.println("by using dynamic dispatch to find area of rectangle:");
		System.out.println("length*breadth="+s1.area());
		System.out.println("by using dynamic dispatch to find area of Circle:");
		Shape s2=new Circle(45);
		System.out.println("2*radius^2="+s2.area());
	}

}
