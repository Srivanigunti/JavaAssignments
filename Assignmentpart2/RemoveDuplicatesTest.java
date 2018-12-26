import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RemoveDuplicatesTest 
{
	private RemoveDuplicates removeDuplicates;
	
	@Before
	public void setUp()
	{
		removeDuplicates = new RemoveDuplicates();
	}
	
	@Test
	public void firstString() {
		String input = "abcabcabc";
		String result = removeDuplicates.removeChar(input);
		assertEquals("abc", result);
	}
	
	@Test
	public void secondString() {
		String input = "javaforschool";
		String result = removeDuplicates.removeChar(input);
		assertEquals("javforschl", result);
	}
	
	@Test
	public void thirdString() {
		String input = "Mississippi";
		String result = removeDuplicates.removeChar(input);
		assertEquals("Misp", result);
	}
}
