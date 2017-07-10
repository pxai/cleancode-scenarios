package io.pello.cleancode.scenarios.errorhandling.better;

import java.util.Scanner;

public class Conversor {
	public void convert () {
		try {
			System.out.println(getValueFromUser() * 0.88d);
		} catch (Exception e) {
			System.err.println("Invalid number given: " + e.getMessage() );
		}
	}
	
	private Double getValueFromUser () throws Exception {
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Please, enter a number");
		line = reader.nextLine();
		
		if (!line.matches("-?\\d+(\\.\\d+)?")) {
			throw new Exception("Number format exception: " + line);
		} else {
			return Double.parseDouble(line);
		}
	}
}
