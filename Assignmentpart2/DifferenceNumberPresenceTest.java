import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DifferenceNumberPresenceTest 
{
	private DifferenceNumberPresence differenceNumberPresence;
	
	@Before
	public void setUp()
	{
		differenceNumberPresence = new DifferenceNumberPresence();
	}

	@Test
	public void DifferenceNumberPresencetest() 
	{
		int value = 2;
		int numbers[]={4,5,6,7,8};
		boolean resultOfNumbers = differenceNumberPresence.findNumber(numbers,value);
		assertEquals(true,resultOfNumbers);
	}

}
