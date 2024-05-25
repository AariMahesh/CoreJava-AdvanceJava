package com.kodnest;

import org.hibernate.Session;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Employee;;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       Configuration cfg= new Configuration();
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       System.out.println("sucess"+" "+session);
       // 
       //session.save();
        Transaction tr=session.beginTransaction();
       //Employee emp=new Employee(5,"jack");
       // session.save(emp);
        // fetecching exact record
//        Employee emp=session.get(Employee.class, 3);
//        System.out.println(emp);
        // fetching all records
        List list=session.createQuery("from Employee").list();
        //fetching by condition
        List list1=session.createQuery("from Employee where id>1").list();
        for(Object o:list)
        {
        	System.out.println(o);
        }
        tr.commit();
    }
}
