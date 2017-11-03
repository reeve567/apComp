package org.koalakode.reeve.apComp.WorkSheets;

public class w4p3 {
	public static void main(String[] args) {
		System.out.println("B");
		System.out.println("D");
		
	}
	
	private static void printIt(String[] array) {
		for (String s: array) {
			if (s.length() < 3 || s.length() > 10)
				System.out.println(s);
		}
	}
	
	private static Student bestGPA(Student[] students) {
		Student best = new Student("joey",0);
		for (Student s: students) {
			if (s.getGPA() > best.getGPA()) {
				best = s;
			}
		}
		return best;
	}
	
	private static void honorRoll(Student[] students) {
		for (Student s : students) {
			if (s.getGPA() >= 3.5) {
				System.out.print(s.getName() + ", ");
			}
		}
		System.out.println();
	}
	
}
