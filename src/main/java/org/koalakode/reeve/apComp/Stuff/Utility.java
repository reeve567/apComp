package org.koalakode.reeve.apComp.Stuff;
// made by reeve
// on 8:04 PM

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Utility {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("this is the config", "this is another part of it");
		try {
			Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8,
					StandardOpenOption.CREATE, StandardOpenOption.CREATE_NEW);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
