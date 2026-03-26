package com.cdac.acts.shape.tester;
import java.util.Scanner;
import com.cdac.acts.shape.Shape;
import com.cdac.acts.shape.Circle;
import com.cdac.acts.shape.Reactangle;
public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int end=0;
		do {
			System.out.println("Enter your choice \n"
					+ "1. Area of Reactangle \n"
					+ "2. Perimeter of Rectangle \n"
					+ "3. Area of Circle \n"
					+ "4. Perimeter of Circle\n"
					+ "5. Exit");
//			System.out.println("");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter Length of Reactangle");
				int len = sc.nextInt();
				System.out.println("Enter Bred of Reactangle");
				int bred = sc.nextInt();
				Shape shape=new Reactangle(len, bred);
				System.out.println(shape.calculateArea());
				break;
				}
			case 2:{
				System.out.println("Enter Length of Reactangle");
				int len = sc.nextInt();
				System.out.println("Enter Breadth of Reactangle");
				int bred = sc.nextInt();
				Shape shape=new Reactangle(len, bred);
				System.out.println(shape.calculatePerimeter());
				break;
				}
			case 3:{
				System.out.print("Enter redius of Circle : ");
				double redi = sc.nextDouble();
				Shape shapeCir = new Circle(redi);
				((Circle) shapeCir).draw();
				System.out.println(shapeCir.calculateArea());
				break;
				}
			case 4:{
				System.out.print("Enter redius of Circle : ");
				double redi = sc.nextDouble();
				Shape shapeCir = new Circle(redi);
				((Circle) shapeCir).draw();
				System.out.println(shapeCir.calculatePerimeter());
				break;
				}
			case 5:{
				end=5;
			}
			}
		}while(end!=5);
		sc.close();
	}

}
