package org.koalakode.reeve.apComp.ForLoopHandout;
// made by reeve
// on 12:48 PM

import static org.koalakode.reeve.apComp.Funcs.println;

public class Exercise3 {

	public static void main(String[] args) {
		String Se = "*";

		for(int x = 7;x>=1;x--) {
			for (int a = x-1;a>=0;a--) {
				System.out.print("*");
			}
			println(" ");
		}

	}

}
