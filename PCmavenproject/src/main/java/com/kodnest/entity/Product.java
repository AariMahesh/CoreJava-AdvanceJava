package com.kodnest.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.*;
@Entity
public class Product {
	@Id
	int Pid;
	String Pname;
	@ManyToMany
	List<Customer> customer;
	public Product(int id,String name,List<Customer> customer)
	{
		super();
		this.Pid=id;
		this.Pname=name;
		this.customer=customer;
	}
	public Product()
	{
		super();
	}
	public void setId(int id)
	{
		this.Pid=id;
	}
	public void setName(String Name)
	{
		this.Pname=Name;
	}
	public void setCustomer(List<Customer> customer)
	{
		this.customer=customer;
	}
	public List getCustomer()
	{
		return customer;
	}
	public int getId()
	{
		return this.Pid;
	}
	public String getName()
	{
		return this.Pname;
	}
	public String toString()
	{
		return "Bike [id="+Pid+", name="+Pname+"]";
	}

}

