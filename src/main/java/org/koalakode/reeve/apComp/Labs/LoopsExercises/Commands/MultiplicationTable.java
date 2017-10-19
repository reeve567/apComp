package org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands;

import static org.koalakode.reeve.apComp.Funcs.println;

public class MultiplicationTable {
	public static void run(int y, int x) {
		for (int j = 0; j <= x; j++) {
			System.out.print("    " + j);
		}
		println();
		
		for (int j = 1; j <= y; j++) {
			for (int i = 0; i <= x; i++) {
				if (i == 0) {
					System.out.print("    " + j);
				}
				else {
					System.out.print( "    " + i * j);
				}
			}
			println();
		}
	}
}
