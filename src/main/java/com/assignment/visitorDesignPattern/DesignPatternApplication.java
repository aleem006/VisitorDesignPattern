package com.assignment.visitorDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
	
@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
		
	      ComputerVisitor vistor = new ComputerVisitorImpl();

	      ComputerParts part = new Keyboard();
	      part.accept(vistor);

	}
}
