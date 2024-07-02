package com.springcore.SpringFrameWork.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    
    {
    	System.out.println("ayush");
    	ApplicationContext conn = new ClassPathXmlApplicationContext("com/springcore/SpringFrameWork/Stereotype/Config.xml");
    	
    	Student st = conn.getBean("st1", Student.class);
    	System.out.println("ayush");
    	System.out.println(st);
    }
}
