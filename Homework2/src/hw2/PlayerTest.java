package hw2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
	
	@Test
	public void testGetName()
	{
		Player player = new Player("Dan");
		System.out.print("Player name ");
		System.out.println(player.getName());
		assertEquals("Dan", "Dan");
	}
	
	@Test
	public void testAddToRoundBalance()
	{
		Player player = new Player("Dan");
		player.addToRoundBalance(450);
		System.out.print("Expected 450 ");
		System.out.println(player.getRoundBalance());
		assertEquals(450, player.getRoundBalance());
	}
	
	@Test
	public void testSubtractFromRoundBalance()
	{
		Player player = new Player("Dan");
		player.addToRoundBalance(5000);
		player.subtractFromRoundBalance(450);
		System.out.print("Expected 4550 ");
		System.out.println(player.getRoundBalance());
		assertEquals(4550, player.getRoundBalance());
	}
	
	@Test
	public void testWinRound()
	{
		Player player = new Player("Dan");
		player.addToRoundBalance(5000);
		player.subtractFromRoundBalance(450);
		player.winRound();
		System.out.print("Expected 4550 ");
		System.out.println(player.getGameBalance());
		assertEquals(4550, player.getGameBalance());
	}
	
	@Test
	public void testLostRound()
	{
		Player player = new Player("Dan");
		player.addToRoundBalance(5000);
		player.subtractFromRoundBalance(450);
		System.out.print("Expected 0 ");
		System.out.println(player.getGameBalance());
		assertEquals(0, player.getGameBalance());
	}
	
}
