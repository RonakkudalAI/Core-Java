package employee;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Employee[] employee = new Employee[4];
		
		LocalDate e1Date1 = LocalDate.of(2002, 8, 10);
		LocalDate e1Date2 = LocalDate.of(2024, 8, 10);
		employee[0] = new Employee(1,"Battery", e1Date1, e1Date2, DeptEnum.HR);
		
		LocalDate e2Date1 = LocalDate.of(2001, 9, 10);
		LocalDate e2Date2 = LocalDate.of(2023, 1, 11);
		employee[1] = new Employee(2,"Charger", e2Date1, e2Date2, DeptEnum.IT);
		
		LocalDate e3Date1 = LocalDate.of(1996, 2, 10);
		LocalDate e3Date2 = LocalDate.of(2018, 1, 11);
		employee[2] = new Employee(3,"Genz14", e3Date1, e3Date2, DeptEnum.SE);
		
		LocalDate e4Date1 = LocalDate.of(2000, 10, 10);
		LocalDate e4Date2 = LocalDate.of(2019, 2, 11);
		employee[3] = new Employee(4,"Rey Mysterio", e4Date1, e4Date2, DeptEnum.PA);
		
		System.out.println("Employee eligible for Gratuity: ");
		checkForGratuity(employee);
	}
	
	static int count = 1;
	
	static void checkForGratuity(Employee[] employee) {
		int year = LocalDate.now().getYear();
		for(int i = 0; i<employee.length; i++) {
			if(year - employee[i].getDateOfJoining().getYear() >= 5) {
				System.out.println(count + ": " + employee[i].geteName());
				count++;
			}
		}
	}
}
/*
Use date of birth, date of joining and Dept enum in existing
Employee class. Check whether the employee eligible for
Gratuity
 */