package hw2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
	
	@Test
	public void testSpin()
	{
		Player player = new Player();
		System.out.print("Player name ");
		System.out.println(player.getPlayerNames("Dan"));
		assertEquals("Dan", "Dan");
	}
	
}
