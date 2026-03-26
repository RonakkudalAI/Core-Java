package com.cdac.acts;
import java.util.Date;
import com.cdac.acts.Accounts;
public class CurrentAccount extends Accounts {

	public CurrentAccount() {
		
	}
	public CurrentAccount(String name,Date doo,double balance)
	{
		super (name,doo,balance);
	}
	@Override
	public double applyInterest() {
		return (this.getBal()*1.01);
	}
	@Override
	public String toString() {
		return "CurrentAccount [applyInterest =" + applyInterest() + ", Account No =" + getNum() + ", Name ="
				+ getName() + ", Date of account Opening=" + getDate() + ", Balance =" + getBal() 
				+ "]";
	}

	
}
