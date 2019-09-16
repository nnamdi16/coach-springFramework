package com.luv2code.springDemoAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Configuring spring container using java code
@Configuration
//@ComponentScan("com.luv2code.springDemoAnnotations")
//Load properties file
@PropertySource("classpath:newSport.properties")
public class SportConfig {

    //Define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //Define bean for our swim coach and inject dependency

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }


}
