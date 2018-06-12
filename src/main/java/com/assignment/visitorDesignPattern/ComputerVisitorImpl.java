package com.assignment.visitorDesignPattern;

public class ComputerVisitorImpl implements ComputerVisitor{

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

}
