package com.kodnest.entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int cid;
	String cname;
	@ManyToMany
	List<Product> product;
	public Customer(int id,String name,List<Product> product)
	{
		super();
		this.cid=id;
		this.cname=name;
		this.product=product;
	}
	public Customer()
	{
		super();
	}
	public void setId(int id)
	{
		this.cid=id;
	}
	public void setName(String Name)
	{
		this.cname=Name;
	}
	public void setProduct(List<Product> product)
	{
		this.product=product;
	}
	public List getProduct()
	{
		return product;
	}
	public int getId()
	{
		return this.cid;
	}
	public String getName()
	{
		return this.cname;
	}
	public String toString()
	{
		return "Bike [id="+cid+", name="+cname+"]";
	}

}

