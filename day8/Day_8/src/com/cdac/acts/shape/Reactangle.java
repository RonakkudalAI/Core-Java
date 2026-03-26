package com.cdac.acts.shape;
import com.cdac.acts.shape.Shape;
public class Reactangle extends Shape {

private int len;
private int bred;
	public Reactangle() {
		// TODO Auto-generated constructor stub
	}
	


	public Reactangle(int len, int bred) {
		super();
		this.len = len;
		this.bred = bred;
	}
	
	@Override
	public double calculateArea() {
		return (len*bred);
	}
	@Override
	public double calculatePerimeter() {
		return ((2*len)+(2*bred));
	}



//	@Override
//	public String toString() {
//		return "Reactangle [length=" + len + ", breadth=" + bred + ", Area=" + calculateArea()
//				+ ", Perimeter=" + calculatePerimeter() + "]";
//	}
	
	
}
