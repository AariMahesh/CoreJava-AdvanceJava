package com.kodnest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import com.kodnest.entity.*;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Configuration cfg= new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        p1.setId(1);
        p1.setName("Mobile");
        session.save(p1);
        p2.setId(2);
        p2.setName("Laptop");
        session.save(p2);
        p3.setId(3);
        p3.setName("tabs");
        session.save(p3);
        ArrayList<Product> p=new ArrayList<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        Customer customer=new Customer(1,"Mahesh",p);
        session.save(customer);
        ArrayList<Product> pl2=new ArrayList<>();
        pl2.add(p1);
        pl2.add(p2);
        pl2.add(p3);
        Customer customer1=new Customer(2,"Dinesh",pl2);
        session.save(customer1);
        
        
        t.commit();
        System.out.println("Sucess");
    }
}
