package com.cdac.acts.Account;


import java.time.LocalDate;
import com.cdac.acts.Account.Account;

@SuppressWarnings("unused")
public class CurrentAccount extends Account {

	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	public CurrentAccount(String accName, LocalDate DOO, double balance ) {
		super(accName, DOO, balance);
		
	}
}
