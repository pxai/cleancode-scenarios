package io.pello.cleancode.scenarios.classes.better;

public class SimpleCar implements Car {
	private static final int INITIAL_TANK = 10;
	private float tank;
	private float speed;
	private String model;
	private String color;
	private String plate;
	private boolean isStarted;
	private boolean isLocked;

	public SimpleCar(String model, String color, String plate) {
		this.tank = INITIAL_TANK;
		this.speed = 0;
		this.model = model;
		this.color = color;
		this.plate = plate;
		this.isStarted = false;
		this.isLocked = true;
	}

	private void startEngine() {
		isStarted = true;
	}

	private void stopEngine() {
		isStarted = false;
	}

	public int move(int meters) {
		if (!isStarted) { isStarted = true; } 
		return accelerate(meters / speed);
	}


	public void stop () {
		brake(speed + 1);
		if (isStarted) { isStarted = false; } 
	}
	
	public void fillUpTank(float petrol) {
		if (INITIAL_TANK < petrol + tank) {
			tank = INITIAL_TANK;
		} else {
			tank = tank + petrol;
		}
	}

	private int accelerate(float f) {
		if (f < speed) {
			speed = speed - f;
		} else {
			speed = 0;
		}
		return (int) (speed / 2);
	}

	private int brake(float sec) {
		if (sec < speed) {
			speed = speed - sec;
		} else {
			speed = 0;
		}
		return (int) (speed / 2);
	}

	public float getTank() {
		return tank;
	}

	public float getSpeed() {
		return speed;
	}


	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getPlate() {
		return plate;
	}


	public boolean isStarted() {
		return isStarted;
	}

	public boolean isLocked() {
		return isLocked;
	}

}
