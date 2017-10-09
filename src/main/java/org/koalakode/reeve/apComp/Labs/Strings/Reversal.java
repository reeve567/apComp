package org.koalakode.reeve.apComp.Labs.Strings;
// made by reeve
// on 4:34 PM

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;

public class Reversal {

	public static String run(String string) {
		char[] chars = string.toCharArray();
		char[] ch = new char[chars.length];

		String s = "";

		for (int i = chars.length-1; i >= 0; i--) {
			s = s.concat(String.valueOf(chars[i]));
		}



		return s;

	}

}
