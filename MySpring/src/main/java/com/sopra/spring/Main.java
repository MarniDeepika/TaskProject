package com.sopra.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		
		
	ApplicationContext cont=new ClassPathXmlApplicationContext("Config.xml");
	Employee e1=(Employee)cont.getBean("Emp");
    System.out.println(e1);
	}

}
