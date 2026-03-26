package person;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Person[] person = new Person[4];
		Address address = new Address("CDAC ACTS, Panchwati, Pashan, Pune-110048");
		
		LocalDate date1 = LocalDate.of(2000, 1, 1);
		person[0] = new Person(10, "Deep", date1, address);
		
		LocalDate date2 = LocalDate.of(1996, 9, 11);
		person[1] = new Person(10, "Thorat", date2, address);
		
		LocalDate date3 = LocalDate.of(1920, 9, 17);
		person[2] = new Person(10, "PACMAN", date3, address);
		
		LocalDate date4 = LocalDate.of(1995, 3, 31);
		person[3] = new Person(10, "Ctmke", date4, address);
	
		//sort(person);
		System.out.println("Person who is born before 15th August 1947: ");
		getPerson(person);
		
		System.out.println("Person who's age is greater that 100: ");
		calAge(person);
	}
	
	static void sort(Person[] person) {
		for(int i =0 ; i< person.length; i++) {
			for(int j = 0; j < person.length-1; i++) {
				if(person[j].getDateOfBirth().isAfter(person[j+1].getDateOfBirth())) {
					Person temp = person[j];
					person[j] = person[j+1];
					person[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(person));
	}
	
	static void getPerson(Person[] person) {
		LocalDate compareDate = LocalDate.of(1947, 8, 15);
		for(int i = 0; i < person.length; i++) {
			if(person[i].getDateOfBirth().isBefore(compareDate) == true){
				System.out.println("Name: " + person[i].getName());
			}
		}
	}
	
	static void calAge(Person[] person) {
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		for(int i = 0; i < person.length; i++) {
			if(year - person[i].getDateOfBirth().getYear() > 100){
				System.out.println("Name: " + person[i].getName() + "! Age in year: " + (year - person[i].getDateOfBirth().getYear()));
			}
			
		}
	}
}

/*
 Find out
whether the person is born before 15th August 1947. calculate
person age and find out person age is above 100 years.
 */
