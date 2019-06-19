package hw2;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class HiddenTextTest {
	@Test
	public void testHiddenConsonants() throws IOException
	{
		HiddenText phrase = new HiddenText("He**o");
		System.out.println(phrase.countHiddenConsonants());
		//assertEquals(2, 2);
	}
	
	@Test
	public void testHiddenLetters() throws IOException
	{
		HiddenText phrase = new HiddenText("He**o");
		System.out.println(phrase.countHiddenConsonants());
		//assertEquals(2, 2);
	}
	
	@Test
	public void testGetHiddenText()
	{
		HiddenText phrase = new HiddenText("Hello");
		System.out.println(phrase.getHiddenText());
		//assertEquals("Hello", "Hello");
	}
	
	@Test
	public void testGetDisplayedText()
	{
		HiddenText phrase = new HiddenText("Hello world");
		System.out.println(phrase.getDisplayedText());
	}
	
	@Test
	public void testLetterCount()
	{
		HiddenText phrase = new HiddenText("Hello world");
		System.out.print("Expected 1 ");
		System.out.println(phrase.letterCount('e'));
	}
}
