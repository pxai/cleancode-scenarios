package io.pello.cleancode.scenarios.classes.wrong;

public class ExposedCar {
	private float tank;
	private float speed;
	private String model;
	private String color;
	private String plate;
	private boolean isStarted;
	private boolean isLocked;
	
	public ExposedCar () {
		
	}
	
	public ExposedCar(float tank, float speed, String model, String color, String plate, boolean isStarted, boolean isLocked) {
		this.tank = tank;
		this.speed = speed;
		this.model = model;
		this.color = color;
		this.plate = plate;
		this.isStarted = isStarted;
		this.isLocked = isLocked;
	}

	/**
	 * starts Engine
	 */
	public void startEngine () {
		isStarted = true;
	}
	
	/**
	 * stops Engine
	 */
	public void stopEngine () {
		isStarted = false;
	}
	
	/**
	 * accelerate
	 * @param sec
	 */
	public int accelerate (float sec) {
		speed = speed + sec;
		tank = tank - sec;
		
		return (int) (speed/2);
	}
	
	/**
	 * breaks;
	 * @param sec
	 */
	public int brake (float sec) {
		if (sec < speed) {
			speed = speed - sec;
		} else {
			speed = 0;
		}
		return (int) (speed/2);
	}
	
	/**
	 * @return the tank
	 */
	public float getTank() {
		return tank;
	}

	/**
	 * @param tank the tank to set
	 */
	public void setTank(float tank) {
		this.tank = tank;
	}

	
	
	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}

	/**
	 * @param plate the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}

	/**
	 * @return the isStarted
	 */
	public boolean isStarted() {
		return isStarted;
	}

	/**
	 * @param isStarted the isStarted to set
	 */
	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	/**
	 * @return the isLocked
	 */
	public boolean isLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked the isLocked to set
	 */
	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	
	
	
	
}
