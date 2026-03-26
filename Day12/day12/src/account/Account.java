package account;

import java.time.LocalDate;

public class Account implements Comparable<Account>{
	private Integer accNo;
	private String name;
	private Double salary;
	private LocalDate dateOfJoining;
	
	private Address address;
	
	static int autoIncrementId = 100;
	
	public Account() {
		this.accNo = autoIncrementId++;
		this.name = "";
		this.salary = 0.0;
		this.dateOfJoining = LocalDate.now();
	}
	
	public Account(String name, Double salary, LocalDate dateOfJoining, Address address) {
		this.accNo = autoIncrementId++;
		this.name = name;
		
		
		
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nAccount No : " + accNo + "\nName : " + name + "\nSalary : " + salary + "\nDate Of Creating : " + dateOfJoining
				+ address.toString();
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int compareTo(Account o) {
		return this.salary.compareTo(o.salary);
	}
}
