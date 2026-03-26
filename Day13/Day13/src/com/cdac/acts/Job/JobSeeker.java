package com.cdac.acts.Job;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.cdac.acts.Job.Degree;

public class JobSeeker implements Comparable<JobSeeker>{
private int registerationId;
private String name;
private String email;
private String password;
private LocalDate dateOfBirth;
private Integer aadharId;
private Long pnum;
private LocalDate graduationDate;
private Degree degree;
private static int regGen=1;
	public JobSeeker(String name, String email, String password, LocalDate dateOfBirth, int aadharId, long pnum,
		LocalDate graduationDate, Degree degree) {
	this.registerationId=regGen++;
	this.name = name;
	this.email = email;
	this.password = password;
	this.dateOfBirth = dateOfBirth;
	this.aadharId = aadharId;
	this.pnum = pnum;
	this.graduationDate = graduationDate;
	this.degree = degree;
}
	public JobSeeker() {
	//Generator
	}
	@Override
	public int hashCode() {
		int result=1;
		result=31*result+(null==name ? 0: name.hashCode());
		result=31*result+(null==email ? 0: email.hashCode());
		result=31*result+(null==password ? 0: password.hashCode());
		result=31*result+(null==dateOfBirth ? 0: dateOfBirth.hashCode());
		result=31*result+(null==aadharId ? 0: aadharId.hashCode());
		result=31*result+(null==pnum ? 0: pnum.hashCode());
		result=31*result+(null==graduationDate ? 0: graduationDate.hashCode());
		result=31*result+(null==degree ? 0: degree.hashCode());
		System.out.println("Hashcode");
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(null==obj) {
			return false;
		}
		if(this.getClass()!=obj.getClass())
		{
			return false;
		}
		if(this==obj) {
			return true;
		}
		JobSeeker jb =(JobSeeker) obj;
		if(this.name.equals(jb.getName()) &&
				this.email.equals(jb.getEmail()) &&
				this.password.equals(jb.getPassword()) &&
				this.dateOfBirth.equals(jb.getDateOfBirth())&&
				this.aadharId.equals(jb.getAadharId()) &&
				this.pnum.equals(jb.getPnum()) &&
				this.graduationDate.equals(jb.getGraduationDate()) &&
				this.degree.equals(jb.getDegree()))
						{return true;}
		return false;
	}
	public int getRegisterationId() {
		return registerationId;
	}
	public void setRegisterationId(int registerationId) {
		this.registerationId = registerationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getAadharId() {
		return aadharId;
	}
	public void setAadharId(Integer aadharId) {
		this.aadharId = aadharId;
	}
	public Long getPnum() {
		return pnum;
	}
	public void setPnum(Long pnum) {
		this.pnum = pnum;
	}
	public LocalDate getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate = graduationDate;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	public static void UpdateEmail(Set<JobSeeker> jb,String Oemail,String Nemail) {
		Iterator<JobSeeker> itr = jb.iterator();
		while(itr.hasNext()) {
			if(itr.next().email==Oemail) {
				itr.next().setEmail(Nemail);
				return;
			}
		}
	
	}
	public static void DisplayDegree(Set<JobSeeker> jb, Degree deg) {
		Iterator<JobSeeker> itr = jb.iterator();
		while(itr.hasNext()) {
			if(itr.next().getDegree()==deg) {
				System.out.println(itr.next());
			}
			
		}
	}
	@Override
	public String toString() {
		return "JobSeeker [registerationId=" + registerationId + ", name=" + name + ", email=" + email + ", password="
				+ password + ", dateOfBirth=" + dateOfBirth + ", aadharId=" + aadharId + ", Phone number=" + pnum
				+ ", Graduation Date=" + graduationDate + ", Degree=" + degree + "]";
	}
	@Override
	public int compareTo(JobSeeker o) {
		// TODO Auto-generated method stub
		return this.email.compareTo(o.email);
	}
	
}
