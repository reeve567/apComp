package org.koalakode.reeve.apComp.Labs.LoopsExercises;

import org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands.ArmstrongNumbers;
import org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands.MultiplicationTable;
import org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands.Pyramid;
import org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands.QuadAndLog;

import java.util.Scanner;

public class console {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a command to run, such as:");
		System.out.println("pyramid");
		System.out.println("quadAndLog");
		System.out.println("multiplicationTable");
		System.out.println("armstrongNumbers");
		System.out.println("exit");
		while (true) {
			System.out.println("Enter a command:");
			String input = scanner.next();
			if (input.equalsIgnoreCase("pyramid")) {
				System.out.println("Please enter a size:");
				int size = scanner.nextInt();
				Pyramid.run(size);
			}
			else if (input.equalsIgnoreCase("quadAndLog")) {
				System.out.println("Please enter a size:");
				int size = scanner.nextInt();
				QuadAndLog.run(size);
			}
			else if (input.equalsIgnoreCase("multiplicationTable")) {
				System.out.println("Please enter a size for x:");
				int x = scanner.nextInt();
				System.out.println("Please enter a size for y:");
				int y = scanner.nextInt();
				MultiplicationTable.run(y,x);
			}
			else if (input.equalsIgnoreCase("armstrongNumbers")) {
				ArmstrongNumbers.run();
			}
			else if (input.equalsIgnoreCase("exit")) {
				break;
			}
			else {
				System.out.println("Unknown command!");
			}
		}
	}
	
}
