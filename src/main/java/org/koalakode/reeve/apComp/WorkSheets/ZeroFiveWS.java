package org.koalakode.reeve.apComp.WorkSheets;
// made by reeve
// on 4:24 PM

import static org.koalakode.reeve.apComp.Funcs.println;

public class ZeroFiveWS {

	public static void main(String[] args) {
		Person personOne = new Person("Heather",38,"F");
		Person personTwo = new Person("Lukas",19,"M");
		Person personThree = new Person("Veronica",4,"F");

		println(personTwo.getName());
		println(personOne.getAge() + personTwo.getAge());
		println(personThree.getGender());

		personOne.birthday();
		personThree.birthday();

		personTwo.introduce();
		personThree.introduce();
	}

}
