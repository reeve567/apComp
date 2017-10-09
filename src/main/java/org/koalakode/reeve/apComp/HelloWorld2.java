package org.koalakode.reeve.apComp;

public class HelloWorld2 {

	private static final double PINUM = 3.141529;

	public static void main(String[] args) {

		System.out.println(PINUM);

		//  does the number integerOne + selected number in integerTwo and does the actio because of the System.out.println(integerTwo); (CaSe SeNsEtIvE)

		int integerOne = 69;

		int integerTwo = integerOne + 11;

		System.out.println(integerTwo);

		// shows the max for each data type

		byte bigByte = 127;

		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);

		// shows the char shown in the System.out.println means if i wrote char anotherChar = 'A' and write System.out.println(anotherChar) it would write that in

		char randomChar = 65;

		System.out.println(randomChar);

		// +-es the stuff in the System.out.println when you make the actions on the () you have put.

		String randomString = "I am a random string";
		String anotherString = "Stuff";

		String andAnotherString = randomString + ' ' + anotherString + ' ' + randomString;

		System.out.println(andAnotherString);

		String intString = Integer.toString(bigByte);

		// converts the double to string and the double is being get from the aDoubleValue

		int stringToInt = Integer.parseInt(intString);

		System.out.println(stringToInt);

	}
}