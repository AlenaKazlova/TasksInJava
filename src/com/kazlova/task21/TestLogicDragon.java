package com.kazlova.task21;

public class TestLogicDragon {

	public static void main(String[] args) {

		Dragon dragon = new Dragon();
		ConsoleInput input = new ConsoleInput();
		ConsoleOutput output = new ConsoleOutput();
		LogicDragon logicDragon = new LogicDragon();

		output.printString("Please input dragon age and press <Enter>:");

		dragon.setAge(input.readInt());

		output.printString("Dragon has " + logicDragon.countHeads(dragon) + " heads");
		output.printString("Dragon has " + logicDragon.countEyes(dragon) + " eyes");

	}

}
