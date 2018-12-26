import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringPalindromeCheck 
{
	private PalindromeCheckStrings StringPalindromeObject;
	
	@Before
	public void setup()
	{
		StringPalindromeObject = new PalindromeCheckStrings();
	}
	
	@Test
	public void checkPalindrome() 
	{
		String input[]= 
			{ 
				"amma",
				"anna",
				"akka",
				"srivani",
				"venkat",
				"mom",
				"dad"
			};
		String expected[] ={ "amma","anna","akka","mom","dad" };
		int count[]={4,4,4,3,3};
		String palindrome[] = StringPalindromeObject.checkPalindrome(input);
		int[] length = StringPalindromeObject.lengthOfPalindrome(palindrome);
		assertArrayEquals(expected,palindrome);
		assertArrayEquals(count,length);
	}

}
