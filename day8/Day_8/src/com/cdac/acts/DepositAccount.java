package com.cdac.acts;
import java.util.Date;
import com.cdac.acts.Accounts;
public class DepositAccount extends Accounts {

	public DepositAccount() {
		
	}
	public DepositAccount(String name,Date doo,double balance)
	{
		super (name,doo,balance);
	}
	@Override
	public double applyInterest() {
		return (this.getBal()*1.08);
	}
	@Override
	public String toString() {
		return "DepositAccount [applyInterest =" + applyInterest() + ", Account No =" + getNum() + ", Name ="
				+ getName() + ", Date of account Opening=" + getDate() + ", Balance =" + getBal() 
				+ "]";
	}

	
}

