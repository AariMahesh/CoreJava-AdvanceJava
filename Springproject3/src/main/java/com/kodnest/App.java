package com.kodnest;
import com.kodnest.bean.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
    	Object bean=context.getBean("p1");
    	System.out.println(bean);
    	
    }
}
