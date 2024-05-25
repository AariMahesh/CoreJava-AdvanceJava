package com.kodnest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.*;
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
    	Object o=context.getBean("t1");
    	System.out.println(o);
    	Object o1=context.getBean("u1");
    	System.out.println(o1);
    }
}
