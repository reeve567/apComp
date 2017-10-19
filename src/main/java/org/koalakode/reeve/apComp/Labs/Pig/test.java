package org.koalakode.reeve.apComp.Labs.Pig;

import java.util.Scanner;

public class test {
	
	private static Scanner in = new Scanner(System.in);
	private static Integer scoreOne = 0;
	private static Integer scoreTwo = 0;
	private static Integer runningScore = 0;
	
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("Player one's turn");
			turn(1);
			System.out.println("Player two's turn");
			turn(2);
			
			if (scoreOne >= 100 || scoreTwo >= 100) {
				if (scoreOne >= 100 && scoreTwo >= 100) {
					if (scoreOne > scoreTwo) {
						System.out.println("Player one won!");
					}
					else if (scoreOne < scoreTwo){
						System.out.println("Player two won!");
					}
					else {
						System.out.println("It's a tie!");
					}
				}
				else {
					if (scoreOne >= 100) {
						System.out.println("Player two won!");
					} else if (scoreTwo >= 100) {
						System.out.println("Player two won!");
					}
				}
				
				break;
			}
		}
	}
	
	private static void turn(int player) {
		boolean cont = true;
		while (cont) {
			int roll = (int) ((Math.random() * 6) + 1);
			if (roll == 1) {
				cont = false;
				System.out.println("You rolled a 1! Your turn is over");
				runningScore = 0;
			} else {
				runningScore += roll;
				
				System.out.println("You rolled a " + roll + ", would you like to continue? Your running score is " + runningScore + ".");
				
				boolean found = false;
				
				while (!found) {
					String s = in.next();
					
					if (s.equalsIgnoreCase("y")) {
						found = true;
					} else if (s.equalsIgnoreCase("n")) {
						found = true;
						cont = false;
						if (player == 1) {
							scoreOne += runningScore;
							System.out.println("Your score is " + scoreOne);
						}
						else {
							scoreTwo += runningScore;
							System.out.println("Your score is " + scoreTwo);
						}
						runningScore = 0;
					} else {
						System.out.println("You entered " + s + ", expected y or n.");
					}
				}
			}
		}
	}
	
}
