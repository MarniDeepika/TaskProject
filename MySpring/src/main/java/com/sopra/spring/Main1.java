package com.sopra.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) 
	{
	ApplicationContext cont=new ClassPathXmlApplicationContext("Config1.xml");
	Person p1=(Person)cont.getBean("PData");
    System.out.println(p1);
	}

}
