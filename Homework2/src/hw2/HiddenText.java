package hw2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HiddenText {
	private String hiddenText;
	//private char[] guessedChars;
	private static final int ASCIIVALUE = 65;
	private char[] displayedText;
	private char[] hiddenTextArray;

	// private String output;
	public HiddenText(String phrase) {
		hiddenText = phrase.toUpperCase();
		displayedText = phrase.toUpperCase().toCharArray();
		char asterisk = '*';
		for(int i = 0; i < hiddenText.length(); i++)
		{
			displayedText[i] = displayedText[i] == ' ' ? ' ' : asterisk;
		}
		hiddenTextArray = hiddenText.toCharArray();

	}

	public int countHiddenConsonants() {
		int consonantCounter = 0;
		for (int i = 0; i < displayedText.length; i++) {
			if (displayedText[i] == '*' && hiddenTextArray[i] != 'A' && hiddenTextArray[i] != 'A'
					&& hiddenTextArray[i] != 'E'
					&& hiddenTextArray[i] != 'I'
					&& hiddenTextArray[i] != 'O'
					&& hiddenTextArray[i] != 'U') {
				consonantCounter++;
			}
		}
		return consonantCounter;
	}

	public int countHiddenLetters() {
		int consonantCounter = 0;

		for (int i = 0; i < displayedText.length; i++) {
			if (displayedText[i] == '*') {
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
		char ch1 = Character.toUpperCase(ch);
		for (int i = 0; i < displayedText.length; i++) {
			if (hiddenTextArray[i] == ch1) {
				charCounter++;
			}
		}
		return charCounter;
	}

	public void update(char ch) {
		char ch1 = Character.toUpperCase(ch);
		for(int i = 0; i < displayedText.length; i++)
		{
			if(hiddenTextArray[i] == ch1)
			{
				displayedText[i] = ch1;
			}
		}
		
		
		
//		String str = hiddenText;
//		char[] charArray = str.toCharArray();
//		char asterisk = '*';
//		for (int i = 0; i < charArray.length; i++) {
//			int ascii = (int) charArray[i] - ASCIIVALUE;
//			if (charArray[i] != ' ' && guessedChars[ascii] != charArray[i]) {
//				charArray[i] = asterisk;
//			}
//		}
//		displayedText = charArray;
	}

	public void updateAllRemaining() {
		displayedText = hiddenText.toUpperCase().toCharArray();
	}

}
