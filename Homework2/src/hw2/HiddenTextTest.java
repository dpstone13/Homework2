package hw2;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class HiddenTextTest {
	@Test
	public void testHiddenConsonants() throws IOException
	{
		HiddenText phrase = new HiddenText("Hello");
		System.out.print("Expected 3 ");
		System.out.println(phrase.countHiddenConsonants());
		assertEquals(3, phrase.countHiddenConsonants());
	}
	
	@Test
	public void testCountHiddenLetters() throws IOException
	{
		HiddenText phrase = new HiddenText("Hello i");
		System.out.print("Expected 6 ");
		System.out.println(phrase.countHiddenLetters());
		assertEquals(6, phrase.countHiddenLetters());
	}
	
	@Test
	public void testGetHiddenText()
	{
		HiddenText phrase = new HiddenText("Hello i");
		System.out.print("Expected HELLO I --> ");
		System.out.println(phrase.getHiddenText());
		assertEquals("HELLO I", phrase.getHiddenText());
	}
	
	@Test
	public void testGetDisplayedText()
	{
		HiddenText phrase = new HiddenText("Hello world");
		System.out.print("Expected ***** ***** --> ");
		System.out.println(phrase.getDisplayedText());
	}
	
	@Test
	public void testGetDisplayedText_Update()
	{
		HiddenText phrase = new HiddenText("Hello world");
		phrase.update('L');
		System.out.print("Expected **LL* ***L* ---> ");
		System.out.println(phrase.getDisplayedText());
	}
	
	@Test
	public void testGetDisplayedText_UpdateAll()
	{
		HiddenText phrase = new HiddenText("Hello world");
		phrase.updateAllRemaining();
		System.out.print("Expected HELLO WORLD ---> ");
		System.out.println(phrase.getDisplayedText());
	}
	
	@Test
	public void testLetterCount()
	{
		HiddenText phrase = new HiddenText("Hello world");
		System.out.print("Expected 1 ");
		System.out.println(phrase.letterCount('e'));
		assertEquals(1, phrase.letterCount('e'));
	}
}
