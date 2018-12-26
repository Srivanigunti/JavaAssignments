import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MissingElementInArrayTest 
{
	private FindMissingElementInArray MissingElementInArray;
	
	@Before
	public void setup()
	{
		MissingElementInArray = new FindMissingElementInArray();
	}
	
	@Test
	public void missingElement() 
	{
		int[] input = { 2,0,3 };
		int expected = 1;
		int answer=MissingElementInArray.missingElement(input); 
		assertEquals(expected,answer);
		
	}

}
