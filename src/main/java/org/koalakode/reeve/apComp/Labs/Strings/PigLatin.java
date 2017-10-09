package org.koalakode.reeve.apComp.Labs.Strings;
// made by reeve
// on 5:00 PM

public class PigLatin {

	public static String run(String s) {
		char[] chars = s.toCharArray();
		String word = "";

		for (int i = chars.length -1; i >= 0; i--) {

		}



	}


	private static String word(String s) {
		char[] chars = s.toCharArray();
		String finel = "";
		boolean vowels = false;

		for (int i = chars.length -1; i >= 0 ; i--) {
			if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
				vowels = true;

			}
		}
		

	}

}
