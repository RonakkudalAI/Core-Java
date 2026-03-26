package employee;

import java.time.LocalDate;
import employee.DeptEnum;

public class Employee {
	private int empNo;
	private String eName;
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoining;
	private DeptEnum dept;
	
	public Employee(int empNo, String eName, LocalDate dateOfBirth, LocalDate dateOfJoining, DeptEnum dept) {
		this.empNo = empNo;
		this.eName = eName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.dept = dept;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee No: " + this.empNo + "\nEmployee Name: " + this.eName;
	}
}


