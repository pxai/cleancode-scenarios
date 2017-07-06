package io.pello.cleancode.scenarios.names;

import java.util.Random;

public class Dungeon {
	private static final int MAX_DAMAGE = 6;
	private String name;
	private int damage;
	private Random random = new Random();
	private boolean hasExit;

	public Dungeon() {
		name = "Dark Dungeon";
		init();
	}

	public Dungeon(String name) {
		this.name = name;
		init();
	}

	private void init() {
		damage = random.nextInt(MAX_DAMAGE);
		hasExit = false;
	}

	public void setExit() {
		this.hasExit = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public boolean hasExit() {
		return hasExit;
	}


}