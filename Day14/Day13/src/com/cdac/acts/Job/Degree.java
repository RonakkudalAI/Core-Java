package com.cdac.acts.Job;

public enum Degree {
ENTC("Electronics and Telecommunication"),
	COMP("Computer"),
	CIV("CIVIL Engineer"),
	ELEC("Electrical");
	private String str;
	private Degree(String str) {
	this.str=str;
	}
public String getValue() {
	return str;
}
}
