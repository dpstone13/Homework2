package hw2;

import org.junit.Test;
import static org.junit.Assert.*;

public class WheelTester {
	
	@Test
	public void testSpin()
	{
		Wheel wheel = new Wheel();
		wheel.spin(14);
		System.out.print("Rotation ");
		System.out.println(wheel.getRotation());
		System.out.print("Segment Value ");
		System.out.println(wheel.getSegmentValue()); //Expected 500
		assertEquals(500, wheel.getSegmentValue());
	}
	
	@Test
	public void testSpin2()
	{
		Wheel wheel = new Wheel();
		wheel.spin(285);
		System.out.print("Rotation ");
		System.out.println(wheel.getRotation());
		System.out.print("Segment Value ");
		System.out.println(wheel.getSegmentValue()); //Expected 450
		assertEquals(450, wheel.getSegmentValue());
	}
	
	@Test
	public void testSpin3()
	{
		Wheel wheel = new Wheel();
		wheel.spin(335);
		System.out.print("Rotation ");
		System.out.println(wheel.getRotation());
		System.out.print("Segment Value ");
		System.out.println(wheel.getSegmentValue()); //Expected Bankrupt (-1)
		assertEquals(-1, wheel.getSegmentValue());
	}
}
