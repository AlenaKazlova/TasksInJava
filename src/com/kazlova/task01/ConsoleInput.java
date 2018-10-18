package com.kazlova.task01;

import java.util.Scanner;

public class ConsoleInput implements Input{
	
	public double readDouble() {
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		scan.close(); 
		return input;
		}
}
