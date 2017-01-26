package com.anjali.training.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anjali.training.bean.Employee;

public class Main {

public static void main(String...args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp = (Employee) context.getBean("employee");
		
		/*Employee employee = new Employee();
		employee.setEmpName("Anjali");
		Address add = new Address();
		add.setCity("Ahmednagar");
		
		employee.setAddress(add);*/
		
		emp.showDetails();
	}

}
