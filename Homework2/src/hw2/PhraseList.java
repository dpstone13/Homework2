package hw2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PhraseList {
	private String fileName;

	public PhraseList(String givenFilename) {
		fileName = givenFilename;
	}

	public String getPhrase(int n) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		ArrayList<String> list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}
		
		String ret = list.get(n);
		return ret;
	}

	public int getSize() throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		ArrayList<String> list = new ArrayList<String>();
		int lineCount = 0;
		while (scanner.hasNextLine()) {
			list.add(scanner.nextLine());
			lineCount++;
		}
	
		return lineCount;
	}

}
