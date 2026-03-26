package com.cdac.acts.Job.tester;
import com.cdac.acts.Job.JobSeeker;
import com.cdac.acts.Job.Degree;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import com.cdac.acts.Job.ValidUtil.ValidationUtil;
import com.cdac.acts.Job.Degree;

public class JobTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<JobSeeker> hashset= new HashSet<>();
Scanner sc=new Scanner(System.in);
int ch,end=0;
do {
	System.out.println("enter your Choice");
	System.out.println("1. Add JobSeeker ");
	System.out.println("2. Display all JobSeeker ");
	System.out.println("3. Update Email.");
	System.out.println("4. Display all jobseeker by their degree type. ");
	System.out.println("5. Sort By Email.");
	System.out.println("6. Sort By DOB.");
	System.out.println("7. Sort By GraduateDate.");
	System.out.println("8. Exit");
	
	ch=sc.nextInt();
	switch (ch) {
	case 1:{

		try {
		System.out.println("Enter the Your name");
		String name=sc.next();
		System.out.println("Enter the Your Email");
		String email=sc.next();
		System.out.println("Enter the Your password");
		String pass=sc.next();
		System.out.println("Enter the Your BirthDate yyyy-MM-dd");
		String date=sc.next();
		LocalDate dob=ValidationUtil.validDob(date);
		if(dob==null) throw new IllegalArgumentException("Invalid date");
		System.out.println("Enter Aadhar Id");
		int aadhar=sc.nextInt();
		System.out.println("Enter your Phone number");
		long pnum=sc.nextLong();
		long validNum=ValidationUtil.ValidPhone(pnum);
		if(validNum==0) throw new IllegalArgumentException("Invalid Phone number");
		System.out.println("Enter the Your Graduation Date yyyy-MM-dd");
		String grad=sc.next();
//		LocalDate graddob=ValidationUtil.validDob(grad);
		LocalDate graddob=LocalDate.parse(grad);
		if(graddob==null) throw new IllegalArgumentException("Invalid date");
		System.out.println("Enter Degree Name");
		String Deg=sc.next();
		Degree degval= Degree.valueOf(Deg);
		if(degval==null) throw new IllegalArgumentException("Invalid Degree name");
		JobSeeker j=new JobSeeker(name,email,pass,dob,aadhar,validNum,graddob,degval);
		hashset.add(j);

		}catch(Exception e) {
			System.out.println("Wrong input");
			continue;
		}
		break;
		}
	case 2:{
		for(JobSeeker acc: hashset) {
			System.out.println(acc);
		}
		break;}
	case 3:{
		System.out.println("Enter your email address");
		String Oemail=sc.next();
		System.out.println("Enter New email address");
		String Nemail=sc.next();
		JobSeeker.UpdateEmail(hashset,Oemail,Nemail);
		System.out.println("Email updated");
		break;
		}
	case 4:{
		System.out.println("Enter your Degree ");
		String Deg=sc.next();
		Degree degval= Degree.valueOf(Deg);
		if(degval==null) throw new IllegalArgumentException("Invalid Degree name");
		JobSeeker.DisplayDegree(hashset, degval);
		break;
		}
	case 5:{
//		System.out.println("Enter your email");
//		String email=sc.next();
		List<JobSeeker> emailSort =new ArrayList<>(hashset);
		Collections.sort(emailSort);
		break;
		}
	case 6:{
		List<JobSeeker> dobSort =new ArrayList<>(hashset);
		Comparator<JobSeeker> sortByDob = new Comparator<JobSeeker>() {
			
			@Override
			public int compare(JobSeeker j1, JobSeeker j2) {
				return j1.getDateOfBirth().compareTo(j2.getDateOfBirth());
			}
		};
		Collections.sort(dobSort,sortByDob);
		break;
		}
	case 7:{
		List<JobSeeker> GdobSort =new ArrayList<>(hashset);
		Comparator<JobSeeker> sortByGDob = new Comparator<JobSeeker>() {
			
			@Override
			public int compare(JobSeeker j1, JobSeeker j2) {
				return j1.getGraduationDate().compareTo(j2.getGraduationDate());
			}
		};
		Collections.sort(GdobSort,sortByGDob);
		break;
		}
	
	case 8:{end=8;
	break;}
	default:{
		System.out.println("Invalid input");
		break;
	}
	}
}while(end!=8);
sc.close();
	}

}
