package lmbdaa;

import java.time.LocalDate;
import java.util.function.Function;

public class ConvertLocalDate {
	
	public static void main(String[] args) {
//		BiFunction<LocalDate, String, LocalDate> d = (x, y) -> LocalDate.parse(y);{
//		LocalDate date = d.apply(date , "2002-11-11");
//		System.out.println(date);
//		}
		
	//String To LocalDate
	Function<String, LocalDate> strToDate = (s) -> LocalDate.parse(s);
	System.out.println(strToDate.apply("2002-11-11"));
	
	//LocalDate To String
	Function<LocalDate, String> datetoStr = (s) -> s.toString();
	System.out.println(datetoStr.apply(LocalDate.now()));

	}
}	
/*
 1) Write lambda for conversion from String to LocalDat and Vice Versa.
	Use Function&lt;R, T&gt; interface
 */
