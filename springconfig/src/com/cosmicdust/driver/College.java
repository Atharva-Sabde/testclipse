package com.cosmicdust.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cosmicdust.beans.StudentBean;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cosmicdust/resources/applicationContext.xml");
		
		StudentBean stud1 = (StudentBean)context.getBean("studentBean");
		
		stud1.getDetails();
		
	}
}
