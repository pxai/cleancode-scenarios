package io.pello.cleancode.scenarios.names;

import java.util.Date;
import java.util.Random;

public class BadNames {

	public void sampleMethod() {
		int a; // age
		float am; // amount
		Date b; // birth date
	}
	
	private void bd () {
		Dungeon d[][] = new Dungeon[10][10];
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				d[i][j] = new Dungeon("Dark Dungeon");
		
		int ei = (int)Math.floor(Math.random() * 10);
		int ej = (int)Math.floor(Math.random() * 10);
		d[ei][ej].setExit();
	}

	public int confusingVars (int O) {
		int l = 1;
		
		if (0 == O) {
			return O * l;
		} else if ( l == O) {
			return O + 1;
		} else {
			return 0;
		}
	}
	
	public void cp (Dungeon[] d1, Dungeon[] d2) {
		for (int i = 0; i<d2.length; i++) {
			d1[i] = d2[i];
		}
	}
	
	public void makeSomeNoise (String par_name) {
		int foo = 0;
		float var = 66.6f;
		int [] some = {6, 14,42};
		String[] data = {"Eugene", "Bob", "Patrick"};
		int variableA = 42;
		boolean boolVarX = false;
		int intA = 15;
		int iB = 42;
		String cName;
		String theCustomerName;
		// abbr
		int ivc; // integer variable counter? 
		int frsDyMnth;
		int snWkYr;
	
		// encodings
		// lblName, txtName,
		String nameString;
		int ageInt;

		// member prefixes:
		_name = par_name;
	}
	
		private String _name;
		
		// Method that returns a greeting
		public String bad_method () {
			return "hello";
		}
}
