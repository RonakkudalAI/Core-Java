package demo1;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private double salary;
	private int size;
	
	public Employee() {
		this.empNo = 0;
		this.salary = 0.0;
	}
	
	public Employee(int empNo, double salary, int size) {
		this.empNo = empNo;
		this.salary = salary;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Employee ID: " + empNo + "\n Employee's Salary: " + salary;
	}
	
	public double getSal() {
		return this.salary;
	}
	
	public static void main(String[] args) {
	Employee[] emp = null;
	Scanner sc = new Scanner(System.in);
	
	int choice = 0;
	
	while(choice != 4) {
	System.out.println("Enter choice: ");
	System.out.println("1. Add an Employee");
	System.out.println("2. Print Employee by Id");
	System.out.println("3. Sort according to salary of Employee");
	System.out.println("4. Exit");
	choice = sc.nextInt();
		
	switch (choice) {
	case 1:
		System.out.println("Enter number of employees");
		int size = sc.nextInt();
		emp = new Employee[size];
		for(int i = 0; i < size ; i++) {
			System.out.println("Enter Employee's Id no: ");
			int empNo = sc.nextInt();
			System.out.println("Enter Employee's salary: ");
			double salary = sc.nextDouble();
			
			Employee s1 = new Employee(empNo, salary, size);
			emp[i] = s1;
			}
		for(int i=0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		break;
		
	case 2:
		System.out.println("Enter Employee Id: ");
		int empNo = sc.nextInt();
		for(int i=0; i< emp.length; i++) {
			if(emp[i].empNo == empNo) {
				System.out.println(emp[i].salary);
			}
		}
		break;
		
	case 3: 
		System.out.println("Sorting by Marks: ");
		
		if(emp != null) {
			for(int i = 0 ; i < emp.length; i++) {
				for(int j = 0; j < emp.length -1; j++) {
					if (emp[j].salary > emp[j+1].salary) {
						double temp = emp[j].salary;
						emp[j].salary = emp[j+1].salary;
						emp[j+1].salary = temp;
						
						int temp1 = emp[j].empNo;
						emp[j].empNo = emp[j+1].empNo;
						emp[j+1].empNo = temp1;
				}
			}
		}
	}	
	
		for (Employee employee : emp) {
			System.out.println(employee);
		}
	break;
	
	case 4:
		System.out.println("Exiting!!");
	}
	
		}
	}
}
