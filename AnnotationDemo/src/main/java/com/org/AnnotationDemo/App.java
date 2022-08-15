package com.org.AnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext con =new AnnotationConfigApplicationContext(AppConfig.class);
        Manager mg=con.getBean(Manager.class);
        mg.dowork();
        mg.getsalary();
        
    }
}
