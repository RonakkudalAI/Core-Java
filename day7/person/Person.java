package person;
import java.time.LocalDate;

public class Person {
	private int addhar;
	private String name;
	private LocalDate dateOfBirth;
	private Address address;
	
	public Person(int addhar, String name, LocalDate dateOfBirth, Address address) {
		this.addhar = addhar;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "\nAdhar No: " + this.addhar + "\nName :" + this.name + "\nDate of Birth: " + dateOfBirth + "\nAddress: " + address.toString();
	}
	
	public LocalDate getDateOfBirth() { return this.dateOfBirth;}
	
	public String getName() {return this.name;}
	
	public LocalDate getAge() {
		return this.dateOfBirth;
	}
}

/*
Create Person class with basic details like addharNumber, name,
date of birth, address (use Address class for this). Find out
whether the person is born before 15th August 1947. calculate
person age and find out person age is above 100 years.
 */
