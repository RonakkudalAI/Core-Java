package com.cdac.acts.employee;
import java.time.LocalDate;


public abstract class Employee {
	private int empId;
	private String name;
	private LocalDate DOB;
	private LocalDate DOJ;
	
	private static int genEmpId = 1;
	
	public Employee() {
		//Default ctor
	}
	
	public Employee(String name, LocalDate DOB,LocalDate DOJ) {
		this.empId=genEmpId++;
		this.name = name;
		this.DOB = DOB;
		this.DOJ=DOJ;
	}

	public LocalDate getDob() {
		return DOB;
	}
	public LocalDate getDoj() {
		return DOJ;
	}
	public abstract void Gratuity();

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", DOB=" + DOB + ", DOJ=" + DOJ +"]";
	}
	
	
}
