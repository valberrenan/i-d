package com.valber.renan.injecaodependencia.controllers;

import com.valber.renan.injecaodependencia.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeling(){
        return greetingService.sayGreeting();
    }
}
