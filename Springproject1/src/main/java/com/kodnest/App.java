package com.kodnest;
import org.kodnest.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
    	Object bean=context.getBean("s1");
    	System.out.println(bean);
    	Object bean1=context.getBean("s2");
    	System.out.println(bean1);
    	Object bean2=context.getBean("s3");
    	System.out.println(bean2);
    }
}
