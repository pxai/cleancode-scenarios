package io.pello.cleancode.scenarios.methods.englishquiz;

import java.util.ArrayList;
import java.util.Scanner;

public class qui {
	public static void main(String[] args) {
		ArrayList<que> qstions = new ArrayList<que>();
		int CORRec = 0;
		String name;

		Scanner rdr = new Scanner(System.in);
		String lin = "";
		int c = 1;

		qstions.add(new que("We study __ the university", "in", "on", "at", "into", "at"));
		qstions.add(new que("We study __ the school", "in", "on", "at", "into", "at"));
		qstions.add(new que("Tyrion is __ prison", "in", "on", "at", "into", "in"));
		qstions.add(new que("Tyson was  __ jail", "in", "on", "at", "into", "in"));
		qstions.add(new que("I was  __ the beach", "in", "on", "at", "into", "on"));
		qstions.add(new que("Turn __ the left", "in", "on", "at", "into", "on"));
		qstions.add(new que("I was waiting __ the corner", "in", "on", "at", "into", "at"));
		qstions.add(new que("We met __ the theatre", "in", "on", "at", "into", "at"));
		qstions.add(new que("It depends  __ the weather", "in", "on", "at", "off", "in"));
		qstions.add(new que("We went  __ train", "in", "on", "onto", "by", "by"));

		for (que q : qstions) {
			System.out.println("Question " + c + ": " + q.questname);
			System.out.println("Options ");
			System.out.println(q.op1);
			System.out.println(q.op2);
			System.out.println(q.op3);
			System.out.println(q.op4);
			System.out.print("Write the correct: ");
			lin = rdr.nextLine();

			if (lin.toLowerCase().equals(q.solut)) {
				CORRec++;
				System.out.println("Ok, That was correct");
				System.out.println("Correct answers: " + CORRec + " out of " + 10);
			} else {
				System.out.println("Wrong answer. The correct was: ");
				System.out.println(q.solut);
				System.out.println("Correct answers: " + CORRec + " out of " + 10);
			}

			c++;
		}
		// Change this to compare with the size of the Vector
		if (CORRec >= 5) {
			System.out.println("Congratulations, you passed the exam with " + CORRec + " correct answers");
		} else {
			System.out.println("You failed: " + CORRec + ". Better luck next time");
		}
	}
}
