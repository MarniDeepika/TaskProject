package com.sopra.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
	ApplicationContext cont=new ClassPathXmlApplicationContext("com/sopra/spring/ref/Config.xml");
	Employee1 e1=(Employee1)cont.getBean("ss");
    System.out.println(e1);
	}

}
