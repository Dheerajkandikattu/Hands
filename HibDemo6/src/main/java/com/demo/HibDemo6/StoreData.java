package com.demo.HibDemo6;

/**
 * Hello world!
 *
 */
import org.hibernate.Session; 
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  


  
public class StoreData {  
   
    public static void main(String[] args) {  
      
    	SessionFactory sessionFactory = HibernateUtil.getInstnce();
        Session session = sessionFactory.openSession();  
        Transaction t=session.beginTransaction();  
          
        Employee e1=new Employee();  
        e1.setName("Gaurav Chawla");  
          
        Regular_Employee e2=new Regular_Employee();  
        e2.setName("Vivek Kumar");  
        e2.setSalary(50000);  
        e2.setBonus(5);  
          
        Contract_Employee e3=new Contract_Employee();  
        e3.setName("Arjun Kumar");  
        e3.setPay_per_hour(1000);  
        e3.setContract_duration("15 hours");  
          
        session.persist(e1);  
        session.persist(e2);  
        session.persist(e3);  
          
        t.commit();  
        session.close();  
        System.out.println("success");        
    }  
}  