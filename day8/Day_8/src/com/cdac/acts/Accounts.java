package com.cdac.acts;
import java.util.Date;
import com.cdac.acts.date.util.DateUtil;
public abstract class Accounts {
	private int accoNum;
	private String Aname;
	private Date DOO;
	private double balance;
	
	private static int accGen=1;
	public Accounts() {
		// TODO Auto-generated constructor stub
		this.accoNum=accGen++;
		System.out.println("Accounts::Accounts()");
	}
	
	public Accounts(String Aname,Date DOO,double balance) 
	{
	this.accoNum=accGen++;
	this.Aname=Aname;
	this.DOO=DOO;
	this.balance=balance;
	}
 abstract public double applyInterest();
 public  double getNum() {
		return this.accoNum;
	}

public  String getName() {
	return this.Aname;
}
public  Date getDate() {
	return this.DOO;
}
public  double getBal() {
	return this.balance;
}
@Override
public String toString() {
	String strDOO=DateUtil.getFormattedDate(DOO, DateUtil.DD_MM_YYYY);
	return "Accounts [accoNum=" + accoNum + ", Aname=" + Aname + ", DOO=" + strDOO + ", balance=" + balance + "]";
}

}
