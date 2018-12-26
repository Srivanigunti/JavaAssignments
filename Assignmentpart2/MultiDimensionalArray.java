import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MultiDimensionalArray 
{
	private FindMultiDimensionalArray findMultiDimensionalArray;
	
	@Before
	public void setUp()
	{
		findMultiDimensionalArray = new FindMultiDimensionalArray();
	}
	
	@Test
	public void elementFindtest() 
	{
		int numbers[][] = {{1,2,3,34,18},{4,5,6,7,12}};
		int number= 6;
		boolean result= findMultiDimensionalArray.checkElementPresence(numbers,number);
		assertEquals(true,result);
	}

}
