package hw2;

/**
 * Encapsulates information about the state of the wheel for a wheel of fortune game.
 * @author Daniel Stone
 */
import java.util.Random;

public class Wheel {
	/**
	 * Constant representing the "bankrupt" wheel segment.
	 */
	public static final int BANKRUPT = -1;

	/**
	 * Constant representing the "free play" wheel segment.
	 */
	public static final int FREE_PLAY = 0;

	/**
	 * Constant representing the "lose a turn" wheel segment.
	 */
	public static final int LOSE_A_TURN = 1;

	/**
	 * Numeric values for the wheel segments.
	 */
	private static final int[] SEGMENT_VALUES = { 500, // 0 degrees
			900, // 15 degrees
			700, 300, 800, 550, 400, 500, 600, 350, 500, 900, BANKRUPT, 650, FREE_PLAY, 700, LOSE_A_TURN, 800, 500, 450, // <--
			500, 300, BANKRUPT, 5000 // 345 degrees
	};

	/**
	 * Represents the degrees of rotation.
	 */
	private int rotation;
	/**
	 * Represents the dollar value.
	 */
	private int value;

	/**
	 * Constructs a new game wheel with an initial rotation of 359 degrees.
	 */
	public Wheel() {
		rotation = 359;
	}

	/**
	 * Adds the given number of degrees to the wheel's position. 
	 * @param degrees
	 * number of degrees to spin the wheel
	 */
	public void spin(int degrees) {
		this.rotation = degrees;
		if (degrees >= 0 && degrees <= 14) {
			value = SEGMENT_VALUES[0];
		} else if (degrees >= 15 && degrees <= 29) {
			value = SEGMENT_VALUES[1];
		} else if (degrees >= 30 && degrees <= 44) {
			value = SEGMENT_VALUES[2];
		} else if (degrees >= 45 && degrees <= 59) {
			value = SEGMENT_VALUES[3];
		} else if (degrees >= 60 && degrees <= 74) {
			value = SEGMENT_VALUES[4];
		} else if (degrees >= 75 && degrees <= 89) {
			value = SEGMENT_VALUES[5];
		} else if (degrees >= 90 && degrees <= 104) {
			value = SEGMENT_VALUES[6];
		} else if (degrees >= 105 && degrees <= 119) {
			value = SEGMENT_VALUES[7];
		} else if (degrees >= 120 && degrees <= 134) {
			value = SEGMENT_VALUES[8];
		} else if (degrees >= 135 && degrees <= 149) {
			value = SEGMENT_VALUES[9];
		} else if (degrees >= 150 && degrees <= 164) {
			value = SEGMENT_VALUES[10];
		} else if (degrees >= 165 && degrees <= 179) {
			value = SEGMENT_VALUES[11];
		} else if (degrees >= 180 && degrees <= 194) {
			value = SEGMENT_VALUES[12];
		} else if (degrees >= 195 && degrees <= 209) {
			value = SEGMENT_VALUES[13];
		} else if (degrees >= 210 && degrees <= 224) {
			value = SEGMENT_VALUES[14];
		} else if (degrees >= 225 && degrees <= 239) {
			value = SEGMENT_VALUES[15];
		} else if (degrees >= 240 && degrees <= 254) {
			value = SEGMENT_VALUES[16];
		} else if (degrees >= 255 && degrees <= 269) {
			value = SEGMENT_VALUES[17];
		} else if (degrees >= 270 && degrees <= 284) {
			value = SEGMENT_VALUES[18];
		} else if (degrees >= 285 && degrees <= 299) {
			value = SEGMENT_VALUES[19];
		} else if (degrees >= 300 && degrees <= 314) {
			value = SEGMENT_VALUES[20];
		} else if (degrees >= 315 && degrees <= 329) {
			value = SEGMENT_VALUES[21];
		} else if (degrees >= 330 && degrees <= 344) {
			value = SEGMENT_VALUES[22];
		} else if (degrees >= 345 && degrees <= 360) {
			value = SEGMENT_VALUES[23];
		} else {
			value = 0;
		}
	}

	/**
	 * @return the current rotation of the wheel.
	 */
	public int getRotation() {
		return rotation;
	}

	/**
	 * @return the value for the segment at the wheel's current rotation.
	 */
	public int getSegmentValue() {
		return value;
	}
}
