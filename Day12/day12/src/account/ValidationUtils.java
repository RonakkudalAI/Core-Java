package account;

import java.time.LocalDate;

public class ValidationUtils {
	public static LocalDate parseDate(String date) {
		LocalDate newDate = LocalDate.parse(date);
		return newDate;
	}
}
