package org.koalakode.reeve.apComp.Labs.LoopsExercises.Commands;

import static org.koalakode.reeve.apComp.Funcs.println;

public class ArmstrongNumbers {
	public static void run() {
		for (int i = 100; i <= 9999; i++) {
			String k = String.valueOf(i);
			if (k.length() == 3) {
				if (Math.pow(Double.parseDouble(k.substring(0,1)),3) + Math.pow(Double.parseDouble(k.substring(1,2)),3) + Math.pow(Double.parseDouble(k.substring(2,3)),3) == i) {
					println(i);
				}
			}
			else {
				if (Math.pow(Double.parseDouble(k.substring(0,1)),4) + Math.pow(Double.parseDouble(k.substring(1,2)),4) + Math.pow(Double.parseDouble(k.substring(2,3)),4) + Math.pow(Double.parseDouble(k.substring(3,4)),4) == i) {
					println(i);
				}
			}
		}
	}
}
