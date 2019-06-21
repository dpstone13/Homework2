package hw2;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class GameTest {
	@Test
	public void testGetSegment()
	{
		String[] string = {"Colin", "Peter", "Allan"};
		Game game = new Game(string);
		Wheel wheel = new Wheel();
		System.out.println(game.getWheelValue());
		//assertEquals(3, phrase.countHiddenConsonants());
	}
}
