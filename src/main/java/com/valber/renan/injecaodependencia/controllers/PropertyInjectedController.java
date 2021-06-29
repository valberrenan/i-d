package com.valber.renan.injecaodependencia.controllers;

import com.valber.renan.injecaodependencia.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeling(){
        return greetingService.sayGreeting();
    }
}
