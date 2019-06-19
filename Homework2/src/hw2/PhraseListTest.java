package hw2;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class PhraseListTest {
	@Test
	public void testGetPhrase() throws IOException
	{
		PhraseList phrase = new PhraseList("D:\\ISU\\cs227\\Workspace\\Homework2\\phrases.txt");
		System.out.println(phrase.getPhrase(1));
		assertEquals(phrase.getPhrase(1), "READ MY LIPS");
	}
	
	@Test
	public void testGetSize() throws IOException
	{
		PhraseList phrase = new PhraseList("D:\\ISU\\cs227\\Workspace\\Homework2\\phrases.txt");
		System.out.print("Expected 10 ");
		System.out.println(phrase.getSize());
		assertEquals(10, 10);
	}
}
