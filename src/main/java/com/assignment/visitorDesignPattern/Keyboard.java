package com.assignment.visitorDesignPattern;

public class Keyboard implements ComputerParts {

	@Override
	public void accept(ComputerVisitor computerVisitor) {
		computerVisitor.visit(this);
	}

}
