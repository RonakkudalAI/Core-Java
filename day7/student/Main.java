package student;
import java.time.LocalDate;
import java.util.Arrays;
import student.Student;

public class Main {

	public static void sort(Student[] student) {
	
		for(int i = 0; i < student.length ; i++) {
			for(int j = 0; j < student.length - 1; j++) {
				
				if(student[j].getDateOfBirth().isAfter(student[j+1].getDateOfBirth())){
					Student temp = student[j];
					student[j] = student[j+1];
					student[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(student));
	}
	
	public static void main(String[] args) {
	Student[] noOfStudent = new Student[4];
	
	LocalDate date1 = LocalDate.of(2002, 8, 13);
	noOfStudent[0] = new Student(1, "Ayush", CourseEnum.DAC, date1);
	
	LocalDate date2 = LocalDate.of(2003, 2, 10);
	noOfStudent[1] = new Student(2, "Himasnhu", CourseEnum.DAC, date2);
	
	LocalDate date3 = LocalDate.of(2000, 12, 13);
	noOfStudent[2] = new Student(3, "Chirag", CourseEnum.DAC, date3);
	
	LocalDate date4 = LocalDate.of(2002, 6, 13);
	noOfStudent[3] = new Student(4, "Baba Yaga", CourseEnum.DAI, date4);
	
	//System.out.println(noOfStudent[0].getDateOfBirth().isBefore(noOfStudent[1].getDateOfBirth()));
	//System.out.println(Arrays.toString(noOfStudent));
	sort(noOfStudent);
	}
}
