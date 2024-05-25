package org.kodnest.bean;

public class Product {
	int pid;
	String pname;
	public Product() {
		super();
		System.out.println("np-c");
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname) {
		
		super();
		System.out.println("p-c");
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		System.out.println("return id");
		return pid;
	}
	public void setPid(int pid) {
		System.out.println("set id");
		this.pid = pid;
	}
	public String getPname() {
		System.out.println("return name");
		return pname;
	}
	public void setPname(String pname) {
		System.out.println("set name..");
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	

}
