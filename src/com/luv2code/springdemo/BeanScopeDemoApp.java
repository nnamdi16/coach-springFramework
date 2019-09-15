package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //Load the bean from the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach",Coach.class);

//        Check if they are the same
        boolean result = (theCoach == alphaCoach);

        //Print out the result
        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\n Memory location for the coach: " + theCoach );
        System.out.println("\n Memory location for alpha coach: " + alphaCoach + "\n");

        context.close();

    }
}
