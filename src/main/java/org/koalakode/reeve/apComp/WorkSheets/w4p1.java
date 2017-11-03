package org.koalakode.reeve.apComp.WorkSheets;

public class w4p1 {
	
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i < 11; i++) {
			System.out.print(i*i + " ");
			total += i*i;
		}
		System.out.println();
		System.out.println(total);
		
		int[] array = new int[]{rand(),rand(),rand(),rand(),rand(),rand(),rand(),rand()};
		int lowest = 100;
		int highest = 0;
		for (int i : array) {
			if (i < lowest) lowest = i;
			if (i > highest) highest = i;
		}
		System.out.println(lowest);
		System.out.println(highest);
		
		String[] teachers = new String[]{"Mr. Mujica","Mrs. Valdivia","Mr. Robinson","Mr. Crowley","Mrs. Dzubia"};
		
		String t = teachers[1];
		teachers[1] = teachers[2];
		teachers[2] = t;
		
		for (String s : teachers) {
			if (s.contains("Mr. ")) s = s.replaceAll("Mr. ","");
			if (s.contains("Mrs. ")) s = s.replaceAll("Mrs. ","");
		}
		
		
		
	}
	
	private static int rand() {
		return (int) (Math.random() * 50 + 1);
	}
	
}
