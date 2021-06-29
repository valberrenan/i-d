package com.valber.renan.injecaodependencia.controllers;

import com.valber.renan.injecaodependencia.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();

    }

    @Test
    void getGreeling() {

        System.out.println(controller.getGreeling());
    }
}