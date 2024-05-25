package com.kodnest;
import java.util.Date;
import java.util.function.*;
public class Predefinedexample2 {
	public static void main(String[] args) {
		//1.predicate
		//exp1
		Predicate<Integer> p=(i)->(i>10);
		System.out.print(p.test(9));
		//exp2 to check whether string of length >4
		Predicate<String> o=(s)->(s.length()>4);
		System.out.println(o.test("Mahesh"));
		//exp3 array elements whoze size is >4 from arry
		String names[]= {"Mahesh","Dinesh","devi"};
		for(String name:names)
		{ if(o.test(name))
		{
			System.out.println(name);
		}
		//2.Functional interface
		//syntax: interface <t,R> Function{ r apply(2 args);}
		//used to return a value and two methods andThen(),compose() it is reverse of andThen()
		//p.addThen(p1).apply(3) step1 p.apply()-->result.apply for p2
		//p.compose(p1).apply(4) step1 p1.apply()-->result.apply for p
		
		//3.consumer
		//accept()
		
			
		}
		System.out.println("--------");
		Consumer<String> c=s->System.out.println(s);
		c.accept("mahi");
		//4.supplier
		//get()
		//exp
		Supplier<Date> d=()-> new Date();
		System.out.println(d.get());
	}

}
