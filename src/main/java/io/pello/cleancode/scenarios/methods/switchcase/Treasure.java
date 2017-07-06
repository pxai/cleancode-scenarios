package io.pello.cleancode.scenarios.methods.switchcase;

/**
 * Represents treasures that you can find in Dungeons there are three types:
 * GOLD, WEAPON, POTION
 * 
 * @author Peter Class
 *
 */
public class Treasure {
	private int type;
	private String name;
	private int value;
	public static final int GOLD = 0;
	public static final int WEAPON = 1;
	public static final int POTION = 2;

	public Treasure(int type, String name, int value) {
		this.type = type;
		this.name = name;
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public int hitPoints() {
		return D6.getD6().roll() / 2;
	}

	public int heal() {
		return value + D6.getD6().roll();
	}


	@Override
	public String toString() {
		return "Treasure [type=" + type + ", name=" + name + ", value=" + value + "]";
	}
}
