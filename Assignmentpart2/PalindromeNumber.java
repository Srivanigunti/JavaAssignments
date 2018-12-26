import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PalindromeNumber 
{
	private PalindromeNumberCheck CheckPalindrome;
	
	@Before
	public void setup()
	{
		CheckPalindrome = new PalindromeNumberCheck();
	}
	
	@Test
	public void PositiveNumberCheck()
	{
		boolean answer= CheckPalindrome.ReverseOfNumber(121);
		assertEquals(true,answer);
	}
	
	@Test
	public void NegativeNumberCheck()
	{
		boolean answer= CheckPalindrome.ReverseOfNumber(-121);
		assertEquals(false,answer);
	}
	
	@Test
	public void CheckOfNonPalindrome()
	{
		boolean answer= CheckPalindrome.ReverseOfNumber(15);
		assertEquals(false,answer);
	}
}
