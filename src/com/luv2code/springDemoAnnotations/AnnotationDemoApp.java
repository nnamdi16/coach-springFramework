package com.luv2code.springDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        //Read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAnnotation-applicationContext.xml");

        //Get the bean from spring container
        Coach theCoach = context.getBean("thatSillyCoach",Coach.class);

        //Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //Close the context
        context.close();
    }
}
