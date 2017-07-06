
package io.pello.cleancode.scenarios.comments;

import java.util.Date;
import java.util.Random;

public class GoodComments {
	private String regexDNI = "[0-9]{8}[A-Z]{1}"; // Ex: 31345753L
	private String now = new Date().toString();	  // Ex: Tue Feb 06 21:36:41 EST 2017

	// returns the average of best marks
	public double average (double[] values) {
		return 0.0d;
	}
	
	public int indexOf (String word, char character) {	
		return -1; // return -1 when character is not found
	}
	
	// TODO, change execution dependency
	public String createPassowrd (int length) {
		String result = "";
		
		Random random = new Random();
		// Use at your own risk. Not very efficient.
		for (int i = 0; i < 10000; i++) {
			random.nextInt(10000); // 10000 it is the only reasenable way
		}
		
		return result;
	}
	
	public String showChanges () {
		// Used only when de usar onky make a disintion of battle
		return "";
	}
}
