package com.springcore.Autowiring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Autowiring/xml/Config.xml");
    	Student st1 = context.getBean("st", Student.class);
    	System.out.println(st1);
    }
}
