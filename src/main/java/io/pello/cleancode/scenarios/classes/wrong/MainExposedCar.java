package io.pello.cleancode.scenarios.classes.wrong;

public class MainExposedCar {
	public static void main(String args[]) {
		ExposedCar car = new ExposedCar(100, 0, "Open Corsa", "Black", "0666EVL", false, true);
		car.setSpeed(100);
		car.setModel("Delorean XL");

		car.startEngine();
		car.accelerate(10);
		car.setStarted(false);
		car.brake(100);
		car.stopEngine();
	}
}
