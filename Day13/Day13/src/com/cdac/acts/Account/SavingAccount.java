package com.cdac.acts.Account;
import java.time.LocalDate;

import com.cdac.acts.Account.Account;

@SuppressWarnings("unused")
public class SavingAccount extends Account {

	public SavingAccount() {
	}
	

	public SavingAccount(String accName, LocalDate DOO, double balance ) {
		super(accName, DOO, balance);
	}
public void Applyinterest() {
 	this.setBalance(getBalance()*1.08);
 	System.out.println("Account balance updated");
}
}
