package com.valber.renan.injecaodependencia.controllers;

import com.valber.renan.injecaodependencia.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeling(){
        return greetingService.sayGreeting();
    }
}
