package org.koalakode.reeve.apComp.Stuff.Utilities;
// made by reeve
// on 8:51 PM

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileGetter {

	public static List<Path> getContents(String s) {
		Path dir = Paths.get(s);
		List<Path> a = new ArrayList<>();
		try {
			DirectoryStream<Path> steam =
					Files.newDirectoryStream(dir);
			for(Path file: steam) {
				a.add(file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return a;
	}

	public static File createFile(String s,String n) {
		File file = null;
		Path dir = Paths.get(s);
		if (dir != null) {
			file = new File(s,n);
		}
		return file;
	}



}
