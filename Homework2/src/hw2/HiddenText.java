package hw2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HiddenText {
	private String hiddenText;
	private char[] guessedChars;
	private static final int ASCIIVALUE = 65;
	private char[] displayedText;

	// private String output;
	public HiddenText(String phrase) {
		hiddenText = phrase.toUpperCase();
		displayedText = phrase.toUpperCase().toCharArray();
		char asterisk = '*';
		for(int i = 0; i < hiddenText.length(); i++)
		{
			displayedText[i] = displayedText[i] == ' ' ? ' ' : asterisk;
		}
		guessedChars = new char[26];

	}

	public int countHiddenConsonants() {
		int consonantCounter = 0;
//"BCDFGHJKLMNPQRSTVWXYZ".indexOf(ch) >= 0
		for (int i = 0; i < hiddenText.length(); i++) {
			if (displayedText.equals('*') && hiddenText[i] ) {
				consonantCounter++;
			}
		}
		return consonantCounter;
	}

	public int countHiddenLetters() {
		int consonantCounter = 0;

		for (int i = 0; i < hiddenText.length(); i++) {
			char ch = displayedText.charAt(i);
			if (ch.contains('*')) {
				consonantCounter++;
			}
		}
		return consonantCounter;
	}

	public char[] getDisplayedText() {

		return displayedText;
	}

	public String getHiddenText() {
		return hiddenText;
	}

	public int letterCount(char ch) {
		int charCounter = 0;
		for (int i = 0; i < hiddenText.length(); i++) {
			char ch1 = hiddenText.charAt(i);
			if (ch1 == ch) {
				charCounter++;
			}
		}
		return charCounter;
	}

	public void update(char ch) {
		String str = hiddenText;
		char[] charArray = str.toCharArray();
		char asterisk = '*';
		for (int i = 0; i < charArray.length; i++) {
			int ascii = (int) charArray[i] - ASCIIVALUE;
			if (charArray[i] != ' ' && guessedChars[ascii] != charArray[i]) {
				charArray[i] = asterisk;
			}
		}
		displayedText = charArray;
	}

	public void updateAllRemaining() {
		displayedText = hiddenText.toUpperCase().toCharArray();
	}

}
