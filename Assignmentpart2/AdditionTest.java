import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AdditionTest 
{
	private AdditionOfTwoNumbers AddingNumbers;
	
	@Before
	public void setup()
	{
		AddingNumbers = new AdditionOfTwoNumbers();
	}
	
	@Test
	public void TwoPositiveNumbers() 
	{
		int answer = AddingNumbers.AdditionOfNumbers(123,23);
		assertEquals(146,answer);
	}

}
