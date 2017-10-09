package org.koalakode.reeve.apComp.Labs.Strings;
// made by reeve
// on 4:51 PM

public class Palindrome {

	public static boolean run(String s) {
		char[] chars = s.toCharArray();
		String h = "";
		String b = "";
		for (char e: chars) {
			if (!(e == ' ' || e == ',' || e == ':' || e == '.')) {
				h = h.concat(String.valueOf(e));
			}
		}
		char[] cha = h.toCharArray();
		for (int i = cha.length-1; i >= 0; i--) {
			b = b.concat(String.valueOf(cha[i]));
		}

		return h.equalsIgnoreCase(b);

	}

}
