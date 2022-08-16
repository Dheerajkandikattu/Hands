package com.org.tav.day8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.openSession();  
        Transaction transaction=session.beginTransaction();
        Employee e1=new Employee();  
        e1.setName("Gaurav Chawla");    
        Contract_Employee e3=new Contract_Employee();  
        e3.setName("Arjun Kumar");  
        e3.setPay_per_hour(1000);  
        e3.setContract_duration("15 hours"); 
        Regular_Employee e2=new Regular_Employee();  
        e2.setName("Vivek Kumar");  
        e2.setSalary(50000);  
        e2.setBonus(5); 
       
        session.persist(e1);  
        session.persist(e3);  
        session.persist(e2);  
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Success");
    }
}
