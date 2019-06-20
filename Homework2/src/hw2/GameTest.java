package hw2;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class GameTest {
	@Test
	public void testBuyVowel() throws IOException
	{
		String[] string = {"Colin", "Peter", "Allan"};
		Game game = new Game(string);
		System.out.println(game.buyVowel('A'));
		//assertEquals(3, phrase.countHiddenConsonants());
	}
	
	
	@Test
	public void testGetAnswer() throws IOException
	{
		HiddenText phrase = new HiddenText("Hello world");
		String[] string = {"Colin", "Peter", "Allan"};
		Game game = new Game(string);
		System.out.println(game.getAnswer());
		//assertEquals(3, phrase.countHiddenConsonants());
	}
	
	@Test
	public void testGetDisplay() throws IOException
	{
		String[] string = {"Colin", "Peter", "Allan"};
		Game game = new Game(string);
		System.out.println(game.getDisplay());
		//assertEquals(3, phrase.countHiddenConsonants());
	}
}
