package com.kazlova.task21;

import java.util.Scanner;

public class ConsoleInput implements Input {
	public int readInt() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		return input;
	}
}
