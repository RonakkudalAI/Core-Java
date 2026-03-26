package student;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tesing {
	private static final String FORMAT = "yyyy/MM/dd";
	private static final String EMPTY = "";
	
	static LocalDate getDate(String date) {
		if ( null == date || EMPTY.equals(date)) {
			return null;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT);
		//this parse method expects the same format that has been declared 
		// it expects the same like user's date == formatted Date
		LocalDate localDate = LocalDate.parse(date, formatter);

		return localDate;
	}
	
	static LocalDate getFormattedDate(String date) {
		if ( null == date || EMPTY.equals(date)) {
			return null;
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate newDate = LocalDate.parse(date);
		String string = newDate.format(formatter);
		
		System.out.println(string);
		
		//DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate nDate = LocalDate.parse(string, formatter);
		System.out.println(nDate);
		return nDate;
	}
	
	static void get() {
		  LocalDate date = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		  String text = date.format(formatter);
		  System.out.println(text);
		  
		  LocalDate parsedDate = LocalDate.parse(text, formatter);
		  System.out.println(parsedDate);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in the format yyyy-mm-dd");
		String date = sc.next();
		//getFormattedDate(date);
		
		get();
		//String date = "2007-03-23";
		/*LocalDate localDate = LocalDate.parse(date);
		//System.out.println(localDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String date2 = localDate.format(formatter);
		
		System.out.println(date2);
		
		LocalDate date1 = LocalDate.of(2002, 8, 13);
		System.out.println(localDate);
*/
		/*Student[] noOfStudent = new Student[10];
		
		noOfStudent[0] = new Student(1, "Ayush", CourseEnum.DAC, date1);
		noOfStudent[1] = new Student(2, "Himasnhu", CourseEnum.DAC, LocalDate.now());
		noOfStudent[2] = new Student(3, "Chirag", CourseEnum.DAC, LocalDate.now());
		noOfStudent[3] = new Student(4, "Baba Yaga", CourseEnum.DAI, LocalDate.now());
		
		System.out.println(Arrays.toString(noOfStudent));
		*/
	}
}
