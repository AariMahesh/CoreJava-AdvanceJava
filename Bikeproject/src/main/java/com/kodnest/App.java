package com.kodnest;
import com.kodnest.entity.*;

/**
 * Hello world!
 *
 */

import java.util.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        System.out.println("Sucess");
        Transaction ts=session.beginTransaction();
        
        //Bike bike=new Bike(2,"duo");
        //session.save(bike);
        //ts.commit();
        //fetching all records
        //List li=session.createQuery("from Bike").list();
        //exact records
        //List li=session.createQuery("from Bike where id>1").list();
//        for(Object o:li)
//        {
//        	System.out.println(o);
//        }
        //ts.commit();
        // extracting one record
//        Bike bike=session.get(Bike.class, 3);
//        System.out.println(bike);
//        System.out.println("Sucess");
        //Mapping unidirectional
        Bike bike=new Bike(1,"DUKE");
        session.save(bike);
        Student student=new Student(1,"Mahesh",bike);
        session.save(student);
        ts.commit();
        System.out.println("sucess");
    }
}
