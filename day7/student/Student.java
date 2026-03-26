package student;
import student.CourseEnum;
import java.time.LocalDate;

public class Student {
	
	private int id;
	private String name;
	private CourseEnum course;
	private LocalDate dateOfBirth;
	
	public Student(int id, String name, CourseEnum course, LocalDate dateOfBirth) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "\nStudent id: " + id + "\nStudent's name: " + name + "\nCourse: " + course + "\nDate of Birth: " + dateOfBirth;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}


/*
Create Enum for course separately with values as DAC, DESD,
DVLSI. Use Course Enum and Date of Birth in Student class.

Sort student by Date of Birth using after/before methods of
java.util.Date/java.time.LocalDate
*/