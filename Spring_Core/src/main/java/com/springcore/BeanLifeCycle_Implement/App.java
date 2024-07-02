package com.springcore.BeanLifeCycle_Implement;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
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

    	System.out.print("Ayush");
    	SpelExpressionParser temp = new SpelExpressionParser();
    	Expression t1 = temp.parseExpression("4+5");
    	System.out.println(t1);
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/BeanLifeCycle_Implement/Config.xml");
////    	context.registerShutdownHook();
////    	context.registerShutdownHook();
//    	Student st1 = context.getBean("student", Student.class);
//    	System.out.println(st1);
    	
    	
    }
}
