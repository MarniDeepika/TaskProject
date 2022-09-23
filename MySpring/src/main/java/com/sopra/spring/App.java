package com.sopra.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext cnt=new AnnotationConfigApplicationContext();
        cnt.scan("com.sopra.spring");
        cnt.refresh();
        Demo d=cnt.getBean(Demo.class);
        int x=d.add(10,30);
        System.out.println(x);
    }
}
