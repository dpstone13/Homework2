package hw2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HiddenText
{  
  private String hiddenText;
  private String output;
  public HiddenText(String phrase)
  {
	  hiddenText = phrase.toUpperCase();
	  char[] hideText = new char[hiddenText.length()];
	  Arrays.fill(hideText,  '*');
	  String output = new String(hideText);
  }
  //bcdfghjklmnpqrstvwxyz
  public int countHiddenConsonants()
  { 
	  int consonantCounter = 0;

	  for(int i = 0; i < hiddenText.length(); i++)
	  {
		  char ch = hiddenText.charAt(i);
		  if(hiddenText.contains("*") && "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(ch) >= 0) 
		  {
			  consonantCounter++;
		  }
	  }
	  return consonantCounter;
  }
  
  public int countHiddenLetters()
  { 
	  int consonantCounter = 0;

	  for(int i = 0; i < hiddenText.length(); i++)
	  {
		  char ch = hiddenText.charAt(i);
		  if(hiddenText.contains("*")) 
		  {
			  consonantCounter++;
		  }
	  }
	  return consonantCounter;
  }
  
  public char[] getDisplayedText()
  {
	  
  }
  
  public String getHiddenText()
  {
	  String words = "";
	  ArrayList<String> charList = new ArrayList<>();
	  Scanner scan = new Scanner(hiddenText);
	  while(scan.hasNext())
	  {
		  words = scan.next();
		  charList.add(words);
	  }
	  scan.close();
	  
	  
		
	  return words;
//		String string = hiddenText;
//		ArrayList<String> chars = new ArrayList<String>();
//		for(char ch: string.toCharArray())
//		{
//			chars.add(ch, "*");
//		}
//		
//		
//		return string; 
  }
  
  public int letterCount(char ch)
  {
	  int res = 0;
	  
	  for(int i=0; i< hiddenText.length(); i++)
	  {
		  if(i == ch)
		  {
			  res++;
		  }
		  return res;
	  }
  }
  
  public void update(char ch)
  {
	  
  }
  
  public void updateAllRemaining()
  {
	  
  }
  
  
}
