package account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AccountMain {
	
	//add account
	public static void addAccount(List <? super Account> list, Scanner sc) throws MinBalException{
		try { 
		sc.nextLine();
		 System.out.println("Enter Account Name: ");
		 String name = sc.nextLine();
		 
		 System.out.println("Enter Account Balance: ");
		 double balance = sc.nextDouble();
		 if(balance < 1000) throw new MinBalException("Amount should be greater than 1000!");
		 sc.nextLine();
		 
		 System.out.println("Enter Account Creation Date in [yyyy-MM-dd]: ");
		 String date = sc.nextLine();
		 LocalDate parsedDate = ValidationUtils.parseDate(date);
		 
		 System.out.println("Enter Address Line1: ");
		 String line1 = sc.nextLine();
		 
		 System.out.println("Enter Address Line2: ");
		 String line2 = sc.nextLine();
		 
		 System.out.println("Enter Address Line3: ");
		 String line3 = sc.nextLine();
		 
		 Address address = new Address(line1, line2, line3);
		 
		 list.add(new Account(name, balance, parsedDate, address));
		 
		} catch(InputMismatchException im) {
			System.out.println(im.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Display All Accounts
	public static void displayAccounts(List <? super Account> list) {
		System.out.println(list.toString());
	}
	
	//main function
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Address address = new Address("CDAC Acts Pune", ", Panchwati, Pashan, Pune", "110048");
	
	List<Account> account = new ArrayList<>();
	int choice = 0;
	
	do {
	System.out.println("******Menu******");
	System.out.println("1. Add Account");
	System.out.println("2. Display all Account");
	System.out.println("3. Sort by Account Name");
	System.out.println("4. Sort by Account Number");
	System.out.println("5. Sort by Account Balance");
	System.out.println("6. Sort by Account Date");
	System.out.println("7. Exit!");
	System.out.println("Enter you choice: ");
	choice = sc.nextInt();
	
			switch(choice) {
			case 1:
				//add account
				try {
					addAccount(account, sc);
				} catch (MinBalException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			case 2:
				//display account
				displayAccounts(account);
				break;
			case 3:
				//sort by Name
				Collections.sort(account, new NameComparator());
				System.out.println(account.toString());
				break;
			case 4:
				//sort by Number
				Collections.sort(account, new NumberComparator());
				System.out.println(account.toString());
				break;
			case 5:
				//sort by balance
				Collections.sort(account);
				System.out.println(account.toString());
				break;
			case 6:
				//sorting according to date
				Comparator<Account> dobComparator = new Comparator<Account>() {
					@Override
					public int compare(Account o1, Account o2) {
						return o1.getDateOfJoining().compareTo(o2.getDateOfJoining());
					}
				};
				Collections.sort(account, dobComparator);
				System.out.println(account.toString());
				break;
			case 7:
				System.out.println("Exiting!!");
				break;
			}
		} while (choice != 7);
	}
}
