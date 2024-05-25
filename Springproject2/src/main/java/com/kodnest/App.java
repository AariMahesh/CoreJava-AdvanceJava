package com.kodnest;
import org.kodnest.bean.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
    	Object bean=context.getBean("p1");
    	System.out.println(bean);
    	Object bean1=context.getBean("p2");
    	System.out.println(bean1);
    }
}
