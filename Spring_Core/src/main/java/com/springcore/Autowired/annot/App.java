package com.springcore.Autowired.annot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Autowired/annot/Config.xml");
    	Student st1 = context.getBean("st", Student.class);
    	System.out.println(st1);
    }
}
