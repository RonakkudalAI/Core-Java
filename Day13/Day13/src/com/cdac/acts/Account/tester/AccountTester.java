package com.cdac.acts.Account.tester;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import com.cdac.acts.Account.Account;
import com.cdac.acts.Account.SavingAccount;
import com.cdac.acts.Account.Exceptions.AccountNotFoundException;
import com.cdac.acts.Account.Exceptions.MinBalException;
import com.cdac.acts.Account.CurrentAccount;
public class AccountTester {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int end=0;
		int ch;
		//List<Integer> list = new CopyOnWriteArrayList<>();
		CopyOnWriteArrayList<Account> acclist=new CopyOnWriteArrayList<Account>();
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Add account");
			System.out.println("2. Display all Accounts");
			System.out.println("3. Find Account Number ");
			System.out.println("4. Transfer amount ");
			System.out.println("5. Remove Account ");
			System.out.println("6. Apply interest to A/C ");
			System.out.println("7. Sort Accounts ");
			System.out.println("8. Sort Accounts by Account Opening Date");
			System.out.println("9. Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:{
				int ch2;
				System.out.println("Enter Account holder name");
				String name=sc.next();
				System.out.println("Enter date in this format yyyy-MM-dd");
				String Date=sc.next();
				LocalDate dob = LocalDate.parse(Date);
				if(dob.isAfter(LocalDate.now())) throw new IllegalArgumentException("Date is not valid it is in future");
				System.out.println("Enter the balance");
				double bal=sc.nextDouble();
				if(bal<1000) throw new IllegalArgumentException("Balance must is greater 1000");
				System.out.println("Enter Type of Account");
				System.out.println("1. Saving Account");
				System.out.println("2. Current Account");
				ch2=sc.nextInt();
				switch(ch2) {
				case 1:{
					Account f = new SavingAccount(name,dob,bal);
					acclist.add(f);
					break;
					}
				case 2:{
					Account f = new CurrentAccount(name,dob,bal);
					acclist.add(f);
					break;
					}
				default:{
					System.out.println("Invalid input");
				}
				}
				break;
				}
			case 2:{
				acclist.forEach(System.out::println);
				break;
				}
			case 3:{
				int accno;
				try {
					
					System.out.println("Enter Account no to find");
					accno=sc.nextInt();
					Account.FindAcc(acclist, accno);
				}catch(AccountNotFoundException e){
				
						  e.printStackTrace();
							System.out.println(e.getMessage());
							continue;
				}
				break;
				}
			case 4:{
				int Saccno,Taccno;
				double amt;
				try {
				System.out.println("Enter Account no of sender");
				Saccno=sc.nextInt();
				System.out.println("Enter Account no of receiver");
				Taccno=sc.nextInt();
				System.out.println("Enter Amount");
				amt=sc.nextDouble();
				Account.Transfer(acclist, Saccno, Taccno, amt);
				}
				catch(AccountNotFoundException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
					continue;
				}
				catch(MinBalException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
					continue;
				}
				break;
				}
			case 5:{
				try {
				System.out.println("Enter Account no to delete");
				int accnum=sc.nextInt();
				
				int index=Account.FindAccIndex(acclist,accnum);
				acclist.remove(index);
				}catch(AccountNotFoundException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
					continue;
				}
				
				break;
				}
			case 6:{
				
				 for (Account account : acclist) {
			            if (account instanceof SavingAccount) {
			                SavingAccount savingAccount = (SavingAccount) account; // Cast to SavingAccount
			                savingAccount.Applyinterest(); // Call the applyInterest method
			            }
			        }
				break;
				}
			case 7:{
				Comparator<Account> acclistComparator = new Comparator<>() {
					@Override
					public int compare(Account a1, Account a2) {
						return Integer.compare(a1.getAccno(), a2.getAccno());
					}
				};
				Collections.sort(acclist, acclistComparator);
				acclist.forEach(System.out::println);
				
				break;}
			case 8:{
				Comparator<Account> DOOlistComparator = new Comparator<>() {
					@Override
					public int compare(Account a1, Account a2) {
//						return o2.getAccName().compareTo(o1.getAccName());
						return a1.getDOO().compareTo(a2.getDOO());
					}
				};
				Collections.sort(acclist, DOOlistComparator);
				acclist.forEach(System.out::println);
				break;
				}
			case 9:{
				end=9;
				break;}
			default:{
				System.out.println("Invalid input");
				break;}
			}
		}while(end != 9);
		
		sc.close();
	}

}
