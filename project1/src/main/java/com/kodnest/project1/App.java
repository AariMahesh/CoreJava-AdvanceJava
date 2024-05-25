package com.kodnest.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import java.lang.module.Configuration;
//import org.hibernate.cgf.Configuration;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration c=new Configuration();
    	c.configure();
    	SessionFactory f=c.buildSessionFactory();
    	Session s=f.openSession();
        System.out.println(s);
    }
}
