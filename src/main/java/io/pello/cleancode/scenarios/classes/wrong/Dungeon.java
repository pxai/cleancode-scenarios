package io.pello.cleancode.scenarios.classes.wrong;

import java.util.ArrayList;
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

	public Character combat (Character warrior1, Character warrior2) {
		// ...
		return null;
	}
	
	public Character thereCanBeOnlyOne (ArrayList<Character> melee) {
		// ...
		return null;
	}
	
	public void castSpell (Spell spell) {
		// ...
	}
	
	public void heal(ArrayList<Character> players, int points) {
		// ..
	}
	
	public void createEnemies (int amount) {
		// ...
	}
	
	public String reportCombat (ArrayList<Character> players) {
		// ..
		return "";
	}
	
	public String reportStatus (ArrayList<Character> players) {
		// ..
		return "";
	}
	
	public void addEquipment (ArrayList<Character> players, ArrayList<Weapon> w) {
		// ...
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