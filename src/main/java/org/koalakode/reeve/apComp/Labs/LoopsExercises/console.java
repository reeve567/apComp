package org.koalakode.reeve.apComp.Labs.LoopsExercises;

import org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands.ArmstrongNumbers;
import org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands.MultiplicationTable;
import org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands.Pyramid;
import org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands.QuadAndLog;

import java.util.Scanner;

import static org.koalakode.reeve.apComp.Funcs.println;

public class console {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		println("Please enter a command to run, such as:");
		println("pyramid");
		println("quadAndLog");
		println("multiplicationTable");
		println("armstrongNumbers");
		println("exit");
		while (true) {
			println("Enter a command:");
			String input = scanner.next();
			if (input.equalsIgnoreCase("pyramid")) {
				println("Please enter a size:");
				int size = scanner.nextInt();
				Pyramid.run(size);
			}
			else if (input.equalsIgnoreCase("quadAndLog")) {
				println("Please enter a size:");
				int size = scanner.nextInt();
				QuadAndLog.run(size);
			}
			else if (input.equalsIgnoreCase("multiplicationTable")) {
				println("Please enter a size for x:");
				int x = scanner.nextInt();
				println("Please enter a size for y:");
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
				println("Unknown command!");
			}
		}
	}
	
}
