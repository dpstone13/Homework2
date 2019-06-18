package hw2;

public class Player {
	private int roundBalance;
	private int gameBalance;
	private String name;
	
	public Player(String givenName)
	{
		name = givenName;
		gameBalance = 0;
	}
	
	public void addToRoundBalance(int toAdd)
	{
		roundBalance = roundBalance + toAdd;
	}
	public void clearRoundBalance()
	{
		this.gameBalance = 0;
	}
	public int getGameBalance()
	{
		return gameBalance;
	}
	public String getName()
	{
		return name;
	}
	public int getRoundBalance()
	{
		return roundBalance;
	}
	public void subtractFromRoundBalance(int toSubtract)
	{
		roundBalance = roundBalance - toSubtract;
	}
	public void winRound()
	{
		gameBalance = gameBalance + roundBalance;
	}
}
