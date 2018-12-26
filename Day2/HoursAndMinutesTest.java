import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HoursAndMinutesTest 
{
	private HoursAndMinutes time;
	private HoursAndMinutes time1;
	private HoursAndMinutes time2;
	private HoursAndMinutes time3;
	
	@Before
	public void setUp()
	{
		time = new HoursAndMinutes(10,20);
		time1 = new HoursAndMinutes(14,60);
		time2 = new HoursAndMinutes(10,20);
		time3 = new HoursAndMinutes(5,60);
	}

	@Test
	public void test() 
	{
		String expectedResult="addition of hours cannot be more than 24 hours in a day";
		HoursAndMinutes answer = HoursAndMinutes.sum(time, time1);
		answer.display();
		assertEquals(expectedResult, "addition of hours cannot be more than 24 hours in a day");
	}

	@Test
	public void test1() 
	{
		String expectedResult="16 hrs 20 min";
		HoursAndMinutes answer = HoursAndMinutes.sum(time2, time3);
		answer.display();
		assertEquals(expectedResult,answer.hours+" hrs "+answer.minutes+" min");
	}
}
