package demo1;

import java.util.Scanner;

public class Student {
	
	private int rollNo;
	private double marks;
	int size;
	
	public Student() {
		this.rollNo = 0;
		this.marks = 0.0;
	}
	
	public Student(int rollNo, double marks, int size) {
		//super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Roll No: " + rollNo + "\n Marks: " + marks;
	}
	
	public void Display() {
		System.out.println("Roll No: " + this.rollNo);
		System.out.println("Marks: " + this.marks);
	}
	
	public int getSize() {
		return this.size;
	}
	
	public double getMarks() {
		return this.marks;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
	
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		Student[] student = null;
		while(choice != 4) {
			System.out.println("Enter choice: ");
			System.out.println("1. Adding student");
			System.out.println("2. Sort according to marks of student");
			System.out.println("3. Print Student by RollNo");
			System.out.println("4. Exit");
			choice = sc.nextInt();
		switch (choice) {
			
		case 1:
			System.out.println("Enter how many students you want to enter");
			int size = sc.nextInt();
			student = new Student[size];
			for(int i = 0; i < size ; i++) {
				System.out.println("Enter Student's Roll no: ");
				int rollNo = sc.nextInt();
				System.out.println("Enter Student's marks: ");
				double marks = sc.nextDouble();
				
				Student s1 = new Student(rollNo, marks, size);
				// now each reference will get an obejct 
				student[i] = s1;
				}
			
				for (int i = 0; i < size; i++) {
					//student[i].Display();
					System.out.println(student[i]);
				}
			break;
		
			case 2:
				System.out.println("Sorting by Marks: ");
				
					if(student != null) {
						for(int i = 0 ; i < student.length; i++) {
							for(int j = 0; j < student.length -1; j++) {
								if (student[j].marks > student[j+1].marks) {
									double temp = student[j].marks;
									student[j].marks = student[j+1].marks;
									student[j+1].marks = temp;
									
									int temp1 = student[j].rollNo;
									student[j].rollNo = student[j+1].rollNo;
									student[j+1].rollNo = temp1;
							}
						}
					}
				}	
				
					for (Student students : student) {
						System.out.println(students);
					}
				break;
				
			case 3:
				System.out.println("Enter Student's Roll no: ");
				int rollNo = sc.nextInt();
				for (int i = 0; i < student.length; i++) {
					if(student[i].rollNo == rollNo) {
						System.out.println(student[i].marks);		
					}
				}
				
				break;
				
			case 4: 
				System.out.println("Exiting!!");
				break;
			}
		}
	}
}
