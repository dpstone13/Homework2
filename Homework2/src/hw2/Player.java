package hw2;
/**
 * Encapsulates information about a player fora game in which money is won in multiple rounds.
 * @author Daniel Stone
 */
public class Player {
	/**
	 * The player balance for an individual round.
	 */
	private int roundBalance;
	/**
	 * The total player balance for a game.
	 */
	private int gameBalance;
	/**
	 * The player name.
	 */
	private String name;
	
	/**
	 * Constructs a player with the given name and zero winnings.
	 * 
	 * @param givenName
	 * The player's name.
	 */
	public Player(String givenName)
	{
		name = givenName;
		gameBalance = 0;
	}
	/**
	 * Increases the player's round balance by the given amount.
	 * @param toAdd
	 * The value to add to the round balance.
	 */
	public void addToRoundBalance(int toAdd)
	{
		roundBalance = roundBalance + toAdd;
	}
	/**
	 * Resets the player's round balance to zero.
	 */
	public void clearRoundBalance()
	{
		this.gameBalance = 0;
	}
	/**
	 * @return the player's game balance(not including potential winnings from the current round).
	 */
	public int getGameBalance()
	{
		return gameBalance;
	}
	/**
	 * @return the player's name.
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the player's round balance (potential winnings for the current round).
	 */
	public int getRoundBalance()
	{
		return roundBalance;
	}
	/**
	 * Decreases the player's round balance by the given amount.
	 * @param toSubtract
	 * The amount to subtract from the round balance.
	 */
	public void subtractFromRoundBalance(int toSubtract)
	{
		roundBalance = roundBalance - toSubtract;
	}
	/**
	 * Adds the player's round balance to the game balance (without modifying the round balance).
	 */
	public void winRound()
	{
		gameBalance = gameBalance + roundBalance;
	}
}
