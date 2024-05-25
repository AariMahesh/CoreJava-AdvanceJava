package com.kodnest.bean;
import java.util.*;
public class Employee {
	private int empid;
	private String empname;
	private HashMap<Integer,String> technologies;
	private HashSet<String> organisations;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, HashMap<Integer, String> technologies, HashSet<String> organisations) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.technologies = technologies;
		this.organisations = organisations;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public HashMap<Integer, String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(HashMap<Integer, String> technologies) {
		this.technologies = technologies;
	}
	public HashSet<String> getOrganisations() {
		return organisations;
	}
	public void setOrganisations(HashSet<String> organisations) {
		this.organisations = organisations;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", technologies=" + technologies
				+ ", organisations=" + organisations + "]";
	}
	
	
}


