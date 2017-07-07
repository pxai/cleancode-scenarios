package io.pello.cleancode.scenarios.classes.datastructurevsobject.object;

import java.util.Random;

public class Player {
	private String name;
	private int strength;
	private int speed;
	private int intelligence;
	private int type;
	private int life;
	Position position;
	private Random random;

	public Player(String name, int type) {
		this.name = name;
		this.type = type;
		init();
	}

	private void init() {
		strength = random.nextInt(10);
		speed = random.nextInt(10);
		intelligence = random.nextInt(10);
		life = strength * 2;
		position = new Position();
	}

	public String getName() {
		return name;
	}

	public void move (int steps) {
		position.changePosition(steps);
	}
	
	public int attack () {
		return (speed + strength)/2;
	}
	
	public int defend () {
		return ((speed + strength) * intelligence)/2;
	}
	
	public int spell () {
		return (speed  * intelligence)/2;
	}
}
