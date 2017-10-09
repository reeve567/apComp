package org.koalakode.reeve.apComp.WorkSheets;
// made by reeve
// on 4:24 PM

public class ZeroFiveWS {

	public static void main(String[] args) {
		Person personOne = new Person("Heather",38,"F");
		Person personTwo = new Person("Lukas",19,"M");
		Person personThree = new Person("Veronica",4,"F");

		System.out.println(personTwo.getName());
		System.out.println(personOne.getAge() + personTwo.getAge());
		System.out.println(personThree.getGender());

		personOne.birthday();
		personThree.birthday();

		personTwo.introduce();
		personThree.introduce();
	}

}
