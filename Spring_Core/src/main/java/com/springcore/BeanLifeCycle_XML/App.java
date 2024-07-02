package com.springcore.BeanLifeCycle_XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/BeanLifeCycle/Config.xml");
    	context.registerShutdownHook();
    	
    	Student st1 = context.getBean("st", Student.class);
    	System.out.println(st1);
    }
}
