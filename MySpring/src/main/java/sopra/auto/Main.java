package sopra.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) 
	{
	ApplicationContext cont=new ClassPathXmlApplicationContext("sopra/auto/Config.xml");
	Student std=(Student) cont.getBean("std");
	System.out.println(std);
	}

}
