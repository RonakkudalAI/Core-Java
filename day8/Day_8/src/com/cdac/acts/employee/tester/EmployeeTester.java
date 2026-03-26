package com.cdac.acts.employee.tester;

import java.time.LocalDate;
import com.cdac.acts.employee.Employee; 
import com.cdac.acts.employee.ContractEmp;








public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee E=new ContractEmp("Ron",LocalDate.of(2000, 1, 13),LocalDate.of(2020, 1, 2));
		System.out.println(E);
		E.Gratuity();
	}

}
