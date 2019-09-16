package com.luv2code.springDemoAnnotations;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return "Greater days ahead ";
    }

}
