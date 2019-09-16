package com.luv2code.springDemoAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        //Read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //Get the bean from spring container
//        Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
//        Coach theCoach = context.getBean("swimCoach", Coach.class);

        //Change Coach class to SwimCoach because SwimCoach has a whole more method  than the Coach Interface
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        //Call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());


        // call our new swim coach methods
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());


        //Close the context
        context.close();
    }
}
