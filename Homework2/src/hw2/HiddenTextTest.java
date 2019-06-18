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
}
