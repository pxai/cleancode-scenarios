package io.pello.cleancode.scenarios.errorhandling.wrong;

import java.util.Scanner;

public class Conversor {
	public void convert () {
		Double value = getValueFromUser();
		if (value == -2) {
			System.err.println("Given value was empty");
		} else if (value == -1) {
			System.err.println("Given value was not numeric");
		} else if (null != value) {
			System.out.println("Conversion: " + value * 0.88d);
		} else {
			System.err.println("Given number was negative");
		}
	}
	
	private Double getValueFromUser () {
		Scanner reader = new Scanner(System.in);
		String line = "";
		Double result;
		
		System.out.println("Please, enter a number");
		line = reader.nextLine();
		
		if (line.trim().equals("")) {
			return -2d;
		} else if (!line.matches("-?\\d+(\\.\\d+)?")) {
			return -1d;
		} else {
			result = Double.parseDouble(line);
			if (result < 0) {
				return null;
			} else {
				return result;
			}
		}
	}
}
