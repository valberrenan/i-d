package com.valber.renan.injecaodependencia;

import com.valber.renan.injecaodependencia.controllers.ConstructorInjectedController;
import com.valber.renan.injecaodependencia.controllers.MyController;
import com.valber.renan.injecaodependencia.controllers.PropertyInjectedController;
import com.valber.renan.injecaodependencia.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjecaoDependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(InjecaoDependenciaApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeling());

		System.out.println("----------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeling());

		System.out.println("------------ Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeling());
	}

}
