package com.cdac.acts.employee;
import java.time.LocalDate;

import com.cdac.acts.employee.Employee;
public class ContractEmp extends Employee{

	public ContractEmp() {
		// TODO Auto-generated constructor stub
	}
	public ContractEmp(String name,LocalDate DOB,LocalDate DOJ) {
		super(name,DOB,DOJ);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Gratuity() {
		// TODO Auto-generated method stub
		LocalDate localDate2 = LocalDate.now();
		int dateOfJoin = localDate2.minusYears(getDoj().getYear()).getYear();
		
		if(dateOfJoin>=5) {
			System.out.println("Eligible For Gratuity");
		}
	}

}
