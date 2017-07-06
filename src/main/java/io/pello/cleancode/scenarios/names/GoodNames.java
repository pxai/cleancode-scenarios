package io.pello.cleancode.scenarios.names;

import java.util.Date;
import java.util.Random;

public class GoodNames {

	private static final int DUNGEON_SIZE = 10;

	public void sampleMethod() {
		int age;
		float amount;
		Date birthDate;
	}

	private void buildDungeons() {
		Dungeon dungeons[][] = new Dungeon[10][10];
		Random random = new Random();
		
		for (int i = 0; i < DUNGEON_SIZE; i++)
			for (int j = 0; j < DUNGEON_SIZE; j++)
				dungeons[i][j] = new Dungeon("Dark Dungeon");

		int exitI = random.nextInt(DUNGEON_SIZE);
		int exitJ = random.nextInt(DUNGEON_SIZE);
		dungeons[exitI][exitJ].setExit();
	}
	
	public void copyDungeons (Dungeon[] originDungeon, Dungeon[] destinyDungeon) {
		for (int i = 0; i<destinyDungeon.length; i++) {
			originDungeon[i] = destinyDungeon[i];
		}
	}
}
