package hw2;
/**
 * Represents some hidden text for a letter-guessing game.
 * @author Daniel Stone
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HiddenText {
	private String hiddenText;
	private char[] displayedText;
	private char[] hiddenTextArray;

	/**
	 * Constructs a GameText using the given string as the hidden text.
	 * 
	 * @param phrase
	 * The phrase that will be used in the game.
	 */
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
	/**
	 * Constructs a GameText using the given string as the hidden text.
	 */
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
	/**
	 * @return the number of alphabetic character positions that are currently not displayed (occupied by '*' characters).
	 */
	public int countHiddenLetters() {
		int consonantCounter = 0;

		for (int i = 0; i < displayedText.length; i++) {
			if (displayedText[i] == '*') {
				consonantCounter++;
			}
		}
		return consonantCounter;
	}
	/**
	 * @return the displayed form of the hidden text, in which only the letters that have been identified by the update() methodare revealed.
	 */
	public char[] getDisplayedText() {

		return displayedText;
	}
	/**
	 * @return the actual hidden text stored in this object.
	 */
	public String getHiddenText() {
		return hiddenText;
	}
	/**
	 * @return the number of times the given character occurs in the hidden text.
	 * @param ch
	 * The character chosen.
	 */
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
	/**
	 * Updates the displayed text to reveal all occurrences ofthe given character in the hidden text, if any.
	 * @param ch
	 * Represents the letter chosen.
	 */
	public void update(char ch) {
		char ch1 = Character.toUpperCase(ch);
		for(int i = 0; i < displayedText.length; i++)
		{
			if(hiddenTextArray[i] == ch1)
			{
				displayedText[i] = ch1;
			}
		}
	}
	/**
	 * Updates the displayed text to reveal all hidden letters.
	 */
	public void updateAllRemaining() {
		displayedText = hiddenText.toUpperCase().toCharArray();
	}

}
