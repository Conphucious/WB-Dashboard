package com.ngu_software.wbdb.modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FSTodo {
	
	// File stored on USB so must put in config the hardcoded dir to USB todo.txt

	private static final File TODO_LIST_FILE = new File("todo.txt");

	public FSTodo() {
		
	}

	private String readFile() {
		String todoStr = "";
		Scanner reader = null;
		try {
			reader = new Scanner(TODO_LIST_FILE);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (reader.hasNextLine()) {
			todoStr += reader.nextLine();
		}
		reader.close();

		return todoStr;
	}

}
