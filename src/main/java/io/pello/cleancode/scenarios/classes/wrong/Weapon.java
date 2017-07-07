package io.pello.cleancode.scenarios.classes.wrong;

import java.util.ArrayList;

public class Weapon {
	private int damage;
	private ArrayList<Character> killedEnemies;
	
	public Weapon(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public String killedEnemiesReport () {
		return "";
	}
	
	public float sliceSomeBread () {
		return 0;
	}
	
	
}
