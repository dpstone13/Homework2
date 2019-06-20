package hw2;
/**
 * This class encapsulates all the logic for a multi-player game of"Wheel of Fortune".
 * @author Daniel Stone
 */
public class Game {
	/**
	 * An instance of the Wheel object.
	 */
	private Wheel wheel;
	/**
	 * An instance of the HiddenText object.
	 */
	private HiddenText hiddenText;
	/**
	 * An instance of the phraseList class.
	 */
	private PhraseList phraseList;
	/**
	 * An array of current players.
	 */
	private Player[] playerArray;
	/**
	 * An instance of the Player object.
	 */
	private Player currentPlayer;
	/**
	 * Determines if a spin is necessary.
	 */
	private boolean needSpin;
	/**
	 * Determines if the round is over.
	 */
	private boolean roundOver;
	/**
	 * Cost to buy a vowel.
	 */
	public static int VOWEL_COST = 250;

	/**
	 * Constructs a new game instance.
	 * 
	 * @param playerNames
	 * An array of all the players' names.
	 */
	public Game(String[] playerNames) {
		needSpin = true;
		roundOver = false;
		playerArray = new Player[playerNames.length];
		for (int i = 0; i < playerNames.length; i++) {
			playerArray[i] = new Player(playerNames[i]);
		}
		currentPlayer = playerArray[0];
	}
	/**
	 * @return whether the given vowel occurs in the hidden text,
	 * updates the displayed text accordingly, and reduces the currentplayer's 
	 * balance by VOWEL_COST.
	 * @param ch
	 * The vowel the player wants to buy.
	 */
	public int buyVowel(char ch) {
		int result = hiddenText.letterCount(ch);
		if(result > 0)
		{
			hiddenText.update(ch);
			currentPlayer.subtractFromRoundBalance(VOWEL_COST);
		}
		return result;
	}
	/**
	 * @return the complete hidden text (with all characters revealed).
	 */
	public String getAnswer() {
		return hiddenText.getHiddenText();
	}
	/**
	 * @return an array showing the characters of the hidden text to be displayed.
	 */
	public char[] getDisplay() {
		return hiddenText.getDisplayedText();
	}
	/**
	 * @return the total winnings for the given player.
	 * @param player
	 * The current player.
	 */
	public int getGameBalance(int player) {
			return playerArray[player].getGameBalance();
	}
	/**
	 * @return the number of players in the game.
	 */
	public int getNumPlayers() {
		return playerArray.length;
	}
	/**
	 * @return the name of the given player.
	 * @param player
	 * The current player.
	 */
	public String getPlayerName(int player) {

		return playerArray[player].getName();
	}
	/**
	 * @return the potential winnings in this round for the given player.
	 * @param player
	 * The current player.
	 */
	public int getRoundBalance(int player) {
		
		return playerArray[player].getRoundBalance();
	}
	/**
	 * @return the current rotation of the wheel for this game.
	 */
	public int getWheelRotation() {

		return wheel.getRotation();
	}
	/**
	 * @return the current rotation of the wheel for this game.
	 */
	public int getWheelValue()
	{
		return wheel.getSegmentValue();
	}
	/**
	 * Checks whether the given consonant occurs in the hidden text,
	 * updates the displayed text accordingly, and adjusts the currentplayer's balance by 
	 * the number of occurrences times the wheel value.
	 * @param ch
	 * The consonant guessed.
	 */
	//
	public int guessConsonant(char ch) {
		int result = hiddenText.letterCount(ch);
		if (result > 0) {
			hiddenText.update(ch);
			currentPlayer.addToRoundBalance(result * wheel.getSegmentValue());
		}
		return result;
	}
	/**
	 * Checks whether the given string matches the hidden text(without regard to case).
	 * @param guess
	 * The guess of what the hidden text may be.
	 */
	public boolean guessPhrase(String guess) {
		if (guess != hiddenText.getHiddenText()) {
			return false;
		}
		roundOver = true;
		return true;
	}
	/**
	 * @return whether the current player needs to spin the wheel.
	 */
	public boolean needsSpin() {
		return needSpin;
	}
	/**
	 * @return whether the current round is over.
	 */
	public boolean roundOver() {
		return roundOver;
	}
	/**
	 * Spins the wheel and updates the game state accordingly.
	 * @param degrees
	 * The degree of the wheel that the spin landed on.
	 */
	public void spinWheel(int degrees) {
		wheel.spin(degrees);
		needSpin = false;
	}
	/**
	 * Start a new round of the game using the given GameText.
	 * @param whoseTurn
	 * Determines which player to spin next.
	 * @param secretPhrase
	 * The phrase that will be used in the next game.
	 */
	public void startRound(int whoseTurn, HiddenText secretPhrase) {
		currentPlayer = playerArray[whoseTurn];
		secretPhrase = hiddenText;
	}
	/**
	 * @return the 0-based index of the player whose turn it is.
	 */
	public int whoseTurn() {
		for (int i = 0; i < playerArray.length; i++) {
			if(playerArray[i].getName().equals(currentPlayer.getName()))
			{
				return i;
			}
		}
		return -1;
	}

}
