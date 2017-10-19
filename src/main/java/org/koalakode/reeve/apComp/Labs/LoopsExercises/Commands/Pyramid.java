package org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands;

public class Pyramid {
	
	public static void run(int rows) {
		int num = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(' ');
			}
			for (int j = 0; j < num; j++) {
				System.out.print('*');
			}
			println();
			num += 2;
			
		}
	}
	
}
