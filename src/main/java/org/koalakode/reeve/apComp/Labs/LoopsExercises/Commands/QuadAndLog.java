package org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands;

import static org.koalakode.reeve.apComp.Funcs.println;

public class QuadAndLog {
	
	public static void run(int n) {
		for (int i = 1; i <= n; i++) {
			println(i + "    " + i*i + "    " + i*Math.log(i));
		}
	}
}
