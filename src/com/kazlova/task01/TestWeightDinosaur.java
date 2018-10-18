package com.kazlova.task01;
//Масса динозавра задаётся в килограммах. Разработайте программу, которая
//вычисляет, сколько это миллиграмм, грамм и тонн.
public class TestWeightDinosaur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsoleOutput output = new ConsoleOutput();
		output.printString("Please input dinosaur weight in kilogram and press <Enter>:");
		
		ConsoleInput input = new ConsoleInput();
		double weightKg=(input.readDouble());
		
		double weightG = LogicWeightDinosaur .calcWeightG(weightKg);
	    double weightMg = LogicWeightDinosaur .calcWeightMg(weightKg); 
	    double weightT = LogicWeightDinosaur .calcWeightT(weightKg);
	    
	
	    output.printString("Dinosaur weight in kilograms: " + weightKg + " kg");
	    output.printString("Dinosaur weight in grams: " + weightG + " g");
	    output.printString("Dinosaur weight in milligrams: " + weightMg + " mg");
	    output.printString("Dinosaur weight in tons: " + weightT + " t");
	
	}

}

