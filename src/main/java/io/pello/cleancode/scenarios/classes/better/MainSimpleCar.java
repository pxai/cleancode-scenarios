package io.pello.cleancode.scenarios.classes.better;

public class MainSimpleCar {
	public static void main(String args[]) {
		SimpleCar car = new SimpleCar("Open Corsa", "Black", "0666EVL");

		car.move(10);
		car.stop();
	}
}
