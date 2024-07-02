package com.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext conn = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student st = conn.getBean("getStudent", Student.class);
        System.out.println(st);

		st.study();
	}

}
