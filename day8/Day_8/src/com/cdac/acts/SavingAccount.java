package com.cdac.acts;
import com.cdac.acts.Accounts;
import java.util.Date;

public class SavingAccount extends Accounts {

	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingAccount(String name, Date DOO, double balance )
	{
		super(name,DOO,balance);
		System.out.println("Saving account :");
		
	}
	@Override
	public String toString() {
		return "SavingAccount [applyInterest()=" + applyInterest() + ", Account No =" + getNum() + ", Name ="
				+ getName() + ", Date of account opening=" + getDate() + ",  Balance=" + getBal() + "]";
	}

	@Override
	public double applyInterest() {
		return (this.getBal()*1.03);
	}
}
