package org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands;

public class QuadAndLog {
	
	public static void run(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "    " + i*i + "    " + i*Math.log(i));
		}
	}
}
