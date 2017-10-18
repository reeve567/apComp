package org.koalakode.reeve.apComp.Labs.LoopsExercises;

public class test {
	
	public static void main(String[] args) {
		multiplicationTable(4,6);
		armstrongNumbers();
	}
	
	
	public static void pyramid(int rows) {
		int num = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(' ');
			}
			for (int j = 0; j < num; j++) {
				System.out.print('*');
			}
			System.out.println();
			num += 2;
			
		}
	}
	
	public static void quadAndLog(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "    " + i*i + "    " + i*Math.log(i));
		}
	}
	
	public static void multiplicationTable(int y, int x) {
		for (int j = 0; j <= x; j++) {
			System.out.print("    " + j);
		}
		System.out.println();
		
		for (int j = 1; j <= y; j++) {
			for (int i = 0; i <= x; i++) {
				if (i == 0) {
					System.out.print("    " + j);
				}
				else {
					System.out.print( "    " + i * j);
				}
			}
			System.out.println();
		}
	}
	
	public static void armstrongNumbers() {
		for (int i = 100; i <= 9999; i++) {
			String k = String.valueOf(i);
			if (k.length() == 3) {
				if (Math.pow(Double.parseDouble(k.substring(0,1)),3) + Math.pow(Double.parseDouble(k.substring(1,2)),3) + Math.pow(Double.parseDouble(k.substring(2,3)),3) == i) {
					System.out.println(i);
				}
			}
			else {
				if (Math.pow(Double.parseDouble(k.substring(0,1)),3) + Math.pow(Double.parseDouble(k.substring(1,2)),3) + Math.pow(Double.parseDouble(k.substring(2,3)),3) + Math.pow(Double.parseDouble(k.substring(3,4)),3) == i) {
					System.out.println(i);
				}
				else {
					System.out.println(i);
				}
			}
		}
	}
	
}
