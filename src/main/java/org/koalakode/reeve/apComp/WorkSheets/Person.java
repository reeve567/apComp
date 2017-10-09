package org.koalakode.reeve.apComp.WorkSheets;
// made by reeve
// on 4:25 PM

import java.io.File;

public class Person {

	private String name;
	private int age;
	private String gender;

	Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		age = 0;
	}

	Person(String name, int age, String gender) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {

		return name;
	}

	public int getAge() {

		return age;
	}

	public String getGender() {

		return gender;
	}
	public void birthday() {
		age ++;
	}

	public void introduce() {
		System.out.println("Hello my name is " + name);
	}

}
