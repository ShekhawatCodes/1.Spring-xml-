package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beans.Student;

public class Main {
	
	public static void main(String[] args) {
		
		String Config_loc = "/com/example/config/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(Config_loc);
		
		
		Student student = (Student)context.getBean("stdId1");
		student.display();
		
		System.out.println("--------------------------------");
		
		Student student2 = (Student)context.getBean("stdId2");
		student2.display();
		}

}
