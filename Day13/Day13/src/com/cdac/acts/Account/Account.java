package com.cdac.acts.Account;
import com.cdac.acts.Account.Exceptions.AccountNotFoundException;
import com.cdac.acts.Account.Exceptions.MinBalException;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class Account {
	private int accNo;
	private String accName;
	private LocalDate DOO;
	private double balance;
	private static int accGen=0;
	private static final int MIN_BAL=1000;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String accName,LocalDate DOO,double bal) {
		this.accNo= accGen++;
		this.accName=accName;
		this.DOO=DOO;
		this.balance=bal;
		System.out.println("Your account number is "+accNo);
		}
	
	
	public int getAccno(){
		return accNo;
	}
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public LocalDate getDOO() {
		return DOO;
	}
	public void setDOO(LocalDate dOO) {
		DOO = dOO;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void FindAcc(List<Account> arracc,int accno)throws AccountNotFoundException  {
		Iterator<Account> itr=arracc.iterator();	
		while(itr.hasNext())
		{
			if(itr.next().accNo==accno) {
				System.out.println(itr.next());
				return;
				
			}
		}
		throw new AccountNotFoundException("Your account doesn't exist!");
		
	}
	public static int FindAccIndex(List<Account> arracc,int accno)throws AccountNotFoundException  {
		Iterator<Account> itr=arracc.iterator();	
		int index=0;
		while(itr.hasNext())
		{
			if(itr.next().accNo==accno) {
				System.out.println(itr.next());
				return index;
			}
			index++;
		}
		throw new AccountNotFoundException("Your account doesn't exist!");
		
	}
	public static void Transfer(List<Account> arracc, int TransAcc, int RecevAcc, double amt) throws MinBalException, AccountNotFoundException {
	    Account sender = null;
	    Account receiver = null;

	    // Find the sender and receiver accounts
	    for (Account acc : arracc) {
	        if (acc.accNo == TransAcc) {
	            sender = acc;
	        } else if (acc.accNo == RecevAcc) {
	            receiver = acc;
	        }
	    }
	    // Check if both accounts were found
	    if (sender == null) {
	        throw new AccountNotFoundException("Sender account doesn't exist!");
	    }
	    if (receiver == null) {
	        throw new AccountNotFoundException("Receiver account doesn't exist!");
	    }

	    // Check for minimum balance after transfer
	    if ((sender.balance - amt) < MIN_BAL) {
	        throw new MinBalException("Insufficient balance! Minimum balance requirement not met.");
	    }

	    // Perform the transfer
	    sender.setBalance(sender.balance - amt);
	    receiver.setBalance(receiver.balance + amt);
	}
	@Override
	public String toString() {
		return "AccountSort [accNo=" + accNo + ", accName=" + accName + ", DOO=" + DOO + ", balance=" + balance + "]";
	}
	

}
