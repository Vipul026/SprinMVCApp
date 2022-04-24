package com.vipul.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        vehicle.drive();
    }
}
