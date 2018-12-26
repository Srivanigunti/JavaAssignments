import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistanceTest 
{
	private Distance distance;
	private Distance distance1;
	
	@Before
	public void setUp()
	{
		distance = new Distance(5.1f,7.2f);
		distance1 = new Distance(7.2f,8.3f);
	}

	@Test
	public void result() 
	{
		String expectedResult = "12.299999 ft 15.5 in";
		Distance result = Distance.sum(distance, distance1);
		result.display();
		assertEquals(expectedResult, result.feet+" ft " +result.inches+" in");
	}

}
