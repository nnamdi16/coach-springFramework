package com.luv2code.springDemoAnnotations;

import com.luv2code.springDemoAnnotations.Coach;
import com.luv2code.springDemoAnnotations.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        //Read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //Get the bean from spring container
//        Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());



        //Close the context
        context.close();
    }
}
