package  io.pello.cleancode.scenarios.classes.datastructurevsobject.datastructure;

public class Player {
	private String name;
	private int strength;
	private int speed;
	private int intelligence;
	private int type;
	private int life;
	Position position;
	
	public Player () {
		
	}
	
	public Player(String name, int strength, int speed, int intelligence, int type, int life, Position position) {
		this.name = name;
		this.strength = strength;
		this.speed = speed;
		this.intelligence = intelligence;
		this.type = type;
		this.life = life;
		this.position = position;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", strength=" + strength + ", speed=" + speed + ", intelligence=" + intelligence
				+ ", type=" + type + ", life=" + life + ", position=" + position + "]";
	}
	
	
	
}
