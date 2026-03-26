package com.cdac.acts.tester;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.cdac.acts.date.util.DateUtil;
import com.cdac.acts.Accounts;
import com.cdac.acts.CurrentAccount;
import com.cdac.acts.DepositAccount;
import com.cdac.acts.SavingAccount;
public class AccountTester {

private static int index1=0;
private static int index2=0;
private static int index3=0;
	public static void main(String[] args)  throws ParseException  {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		Accounts []crAcc=new CurrentAccount[3];
		Accounts [] savAcc=new SavingAccount[3];
		Accounts [] depoAcc=new DepositAccount[3];
		   int end=0;
		  do {
			
			  System.out.println("Enter Type of account you want \n"
			  		+ "1.Saving Account\n"
			  		+ "2.Current Account\n"
			  		+ "3.Deposit Account\n"
			  		+ "4.Exit\n"
			  		);
			  
			  int choice;
			  System.out.print("Enter your choice : ");
			  choice = sc.nextInt();
			  switch(choice) {
			  case 1: {
				 
				  System.out.println("Enter Account userName: ");
				  String name=sc.next();
				  System.out.println("Enter date in DD/MM/YYYY format : ");
				  String strDate=sc.next();
				  Date date = DateUtil.getDate(strDate, DateUtil.DD_MM_YYYY);
				  System.out.println("Enter Account Balance");
				  double bal=sc.nextInt();
				  savAcc[index1]= new SavingAccount(name,date,bal);
				  System.out.println(savAcc[index1]);
				  index1++;
				  break;
			  }
			  case 2: {
				  System.out.println("Enter Account userName: ");
				  String name=sc.next();
				  System.out.println("Enter date in DD/MM/YYYY format : ");
				  String strDate=sc.next();
				  Date date = DateUtil.getDate(strDate, DateUtil.DD_MM_YYYY);
				  System.out.println("Enter Account Balance");
				  double bal=sc.nextInt();
				  crAcc[index2]= new CurrentAccount(name,date,bal);
				  System.out.println(crAcc[index2]);
				  index2++;
				  break;
			  }
			  case 3: {
				  System.out.println("Enter Account userName: ");
				  String name=sc.next();
				  System.out.println("Enter date in DD/MM/YYYY format : ");
				  String strDate=sc.next();
				  Date date = DateUtil.getDate(strDate, DateUtil.DD_MM_YYYY);
				  System.out.println("Enter Account Balance");
				  double bal=sc.nextInt();
				  depoAcc[index3]= new DepositAccount(name,date,bal);
				  System.out.println(depoAcc[index3]);
				  index3++;
				  break;
			  }
			  case 4: {
				  System.out.println("Exiting");
				  end=4;
				  break;
			  }
			  default:{
				  System.out.println("Invalid Input");
				  break;
			  }
			  }
		  }while(end!=4);
	 sc.close();
	}

}
