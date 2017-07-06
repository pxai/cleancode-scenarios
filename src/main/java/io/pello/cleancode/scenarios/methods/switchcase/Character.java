package io.pello.cleancode.scenarios.methods.switchcase;

public class Character {
	private String name;
	private int strength;
	private int speed;
	private int intelligence;
	private int type;
	private int life;

	public Character(String name, int type) {
		this.name = name;
		this.type = type;
		initialize();
	}

	private void initialize() {
		strength = D6.getD6().roll();
		speed = D6.getD6().roll();
		intelligence = D6.getD6().roll();
		life = strength * 2;
	}

	public int attack() {
		int points = 0;
		// the attack calculation depends on
		// the type of character -code smell
		switch (type) {
		case 0: // barbarian
			points = strength + D6.getD6().roll();
			break;
		case 1: // elf
			points = speed + D6.getD6().roll();
			break;
		case 2: // dwarf
			points = strength + D6.getD6().roll();
			break;
		case 3: // wizard
			points = intelligence + D6.getD6().roll();
			break;
		default:
			points = D6.getD6().roll();
			break;
		}
		
		// Side-effects
		strength = strength - (points/2);
		speed = speed - (points/3);
		
		return points;
	}


	public int defend() {
		int points = 0;
		// the defense calculation depends on
		// the type of character -code smell
		switch (type) {
		case 0: // barbarian
			points = (speed + strength) / 2 + D6.getD6().roll();
			break;
		case 1: // elf
			points = (speed + intelligence) / 2 + D6.getD6().roll();
			break;
		case 2: // dwarf
			points = strength + D6.getD6().roll();
			break;
		case 3: // wizard
			points = intelligence + D6.getD6().roll();
			break;
		default:
			points = D6.getD6().roll();
			break;
		}
		return points;
	}

	public String info() {
		return name + " [strength=" + strength + ", speed=" + speed + ", intelligence=" + intelligence + ", type="
				+ getType() + ", life=" + life + "]";
	}

	public String getName() {
		// Command-Query not separated!!
		if (null != name || name.equals("")) {
			name = "Default";
		}
		return name;
	}

	public void takeLife(int points) {
		life -= points;
	}

	public int getLife() {
		return life;
	}


	public String getType() {
		String typeName = "";
		switch (type) {
		case 0: // barbarian
			typeName = "Barbarian";
			break;
		case 1: // elf
			typeName = "Elf";
			break;
		case 2: // dwarf
			typeName = "Dwarf";
			break;
		case 3: // wizard
			typeName = "Wizard";
			break;
		default:
			typeName = "Unknown";
			break;
		}
		return typeName;
	}
}