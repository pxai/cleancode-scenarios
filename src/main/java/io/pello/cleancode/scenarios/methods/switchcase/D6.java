package io.pello.cleancode.scenarios.methods.switchcase;

import java.util.Random;

public class D6 {
	Random random = new Random();
	private static D6 d6;

	/**
	 * private constructor
	 */
	private D6() {
	}

	/**
	 * this gives access to unique instance of D6
	 * 
	 * @return
	 */
	public static D6 getD6() {
		if (d6 == null) {
			d6 = new D6();
		}
		return d6;
	}

	/**
	 * roll the D6 dice, gives a number between 0 and 5
	 * 
	 * @return
	 */
	public int roll() {
		return random.nextInt(6);
	}
}