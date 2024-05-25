package com.kodnest;
import java.util.function.*;
import java.util.*;
class Employee
{
	String name;
	int salary;
	int experience;
	Employee(String name,int salary,int exp)
	{
		name=this.name;
		salary=this.salary;
		experience=this.experience;
		
	}
}
public class Example3 {
	public static void main(String[] args) {
		Employee emp=new Employee("Mahesh",25000,1);
		Employee emp1=new Employee("Mahesh1",25000,1);
		Employee emp2=new Employee("Mahesh2",25000,1);
		Employee emp3=new Employee("Mahesh3",25000,1);
		ArrayList<Employee> al=new ArrayList<>();
		al.add(emp);
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		
		Predicate<Employee> e= e1->(e1.salary >3000 && e1.experience>1);
		for(Employee em:al)
		{
			if(e.test(em))
			{
				System.out.println(em.name);
			}
		}
		// and or negate
		int[] arr= {5,7,4,7,8,100};
		Predicate<Integer> p1=p->(p%2==0);
		Predicate<Integer> p2=p3->(p3>50);
		for(int i:arr)
		{
			if(p1.and(p2).test(i))
			{
				System.out.println(i+" is even and greater than 50");
			}
		}
	}

}
