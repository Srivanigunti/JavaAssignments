import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CheckingOfStringTest 
{
	CheckingOfString checkingOfString;

	@Before
	public void setUp()
	{
		checkingOfString= new CheckingOfString();
		
	}
	
	@Test
	public void test() 
	{
		String[] names={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		int actual=checkingOfString.stringCheck(names,"Sam");
		int expected= 2;
		assertEquals(expected,actual);	
	}

}
