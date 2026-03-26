package com.cdac.acts.shape;
import com.cdac.acts.shape.Shape;

public class Circle extends Shape {
	private double redi;
	private final double PI = 3.14;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double redi) {
		super();
		this.redi = redi;
	}
	
	@Override
	public double calculateArea() {
		return (PI*redi*redi);
	}
	
	public double calculatePerimeter() {
		return (2*PI*redi);
	}
//	@Override
//	public String toString() {
//		return "Reactangle [ Radius ="  + ", Area=" + calculateArea()
//				+ ", Perimeter=" + calculatePerimeter() + "]";
//	}
	public void draw() {
		System.out.println("Drawing.....");
	}
	
}
