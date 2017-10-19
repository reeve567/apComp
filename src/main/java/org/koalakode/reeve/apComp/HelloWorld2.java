package org.koalakode.reeve.apComp;

public class HelloWorld2 {

	private static final double PINUM = 3.141529;

	public static void main(String[] args) {

		println(PINUM);

		//  does the number integerOne + selected number in integerTwo and does the actio because of the println(integerTwo); (CaSe SeNsEtIvE)

		int integerOne = 69;

		int integerTwo = integerOne + 11;

		println(integerTwo);

		// shows the max for each data type

		byte bigByte = 127;

		println(Float.MAX_VALUE);
		println(Double.MAX_VALUE);

		// shows the char shown in the println means if i wrote char anotherChar = 'A' and write println(anotherChar) it would write that in

		char randomChar = 65;

		println(randomChar);

		// +-es the stuff in the println when you make the actions on the () you have put.

		String randomString = "I am a random string";
		String anotherString = "Stuff";

		String andAnotherString = randomString + ' ' + anotherString + ' ' + randomString;

		println(andAnotherString);

		String intString = Integer.toString(bigByte);

		// converts the double to string and the double is being get from the aDoubleValue

		int stringToInt = Integer.parseInt(intString);

		println(stringToInt);

	}
}