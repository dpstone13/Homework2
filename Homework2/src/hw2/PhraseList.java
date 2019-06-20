package hw2;

/**
 * This class encapsulates a list of strings representing phrases or words for use ina letter-guessing game. The list is initialized from a file.
 * @author Daniel Stone
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PhraseList {
	/**
	 * This is a constant for the number of pins at the beginning of each frame.
	 */
	private String fileName;

	/**
	 * Constructs a GamePhraseList that will select phrases from the given file.
	 * 
	 * @param givenFileName
	 *            The path to the file that will be used as a list of phrases.
	 */
	public PhraseList(String givenFilename) {
		fileName = givenFilename;
	}

	/**
	 * @return the nth phrase from the file, where the first line of the fileis
	 *         numbered zero.
	 * @param n
	 *            Determines which line from the text file is to be used as the
	 *            phrase for that round.
	 */
	public String getPhrase(int n) {
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			ArrayList<String> list = new ArrayList<String>();
			while (scanner.hasNextLine()) {
				list.add(scanner.nextLine());
			}

			String ret = list.get(n);
			return ret;
		} catch (FileNotFoundException ex) {
			return " ";
		}

	}

	/**
	 * @return the number of strings in this phrase list.
	 */
	public int getSize() {
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			ArrayList<String> list = new ArrayList<String>();
			int lineCount = 0;
			while (scanner.hasNextLine()) {
				list.add(scanner.nextLine());
				lineCount++;
			}

			return lineCount;
		} catch (FileNotFoundException ex) {
			return 0;
		}
	}

}
