package com.luv2code.springdemo;

import com.luv2code.springDemoAnnotations.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		// ... let's come back to this ...
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
						
		// close the context
		context.close();
	}

    public static class JavaConfigDemoApp {
        public static void main(String[] args) {
            //Read spring config file
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("beanAnnotation-applicationContext.xml");

            //Get the bean from spring container
    //        Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
            com.luv2code.springDemoAnnotations.Coach theCoach = context.getBean("tennisCoach", Coach.class);

            //Call a method on the bean
            System.out.println(theCoach.getDailyWorkout());

            //Close the context
            context.close();
        }
    }
}






