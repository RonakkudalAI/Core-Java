package com.cdac.acts.Job.ValidUtil;
import java.time.LocalDate;

public class ValidationUtil {
	
	public ValidationUtil() {
		// TODO Auto-generated constructor stub
	}
	public static LocalDate validDob(String strDob)
	{
		LocalDate dob=LocalDate.parse(strDob);
		LocalDate today = LocalDate.now();
		LocalDate requireDate=today.minusYears(21);
		if(dob.isBefore(requireDate)) {
			return dob;
		}
		return null;
	}
	
	public static long ValidPhone(long Phone) {
		long temp = Phone; 
		int count = 0;
		while( temp>0) {
			temp = temp/10;
			count++;
		}
		if(count==10) {
			return Phone;
		}
		return 0;
	}
}
