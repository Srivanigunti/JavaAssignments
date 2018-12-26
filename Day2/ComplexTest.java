import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ComplexTest 
{
	private Complex complex; // define variables
	private Complex complex1;

	@Before
	public void setUp()
	{
		complex = new Complex(6.6,4); //Declare values
		complex1 = new Complex(2.2,3.5);
	}
	
	@Test
	public void sumOfTwoComplexNumbers () 
	{
		String expectedResult = "8.8+7.5i"; //Give the result we expect
		Complex result = Complex.sumOfTwoComplexNumbers(complex,complex1); //Calculate the result
		assertEquals(expectedResult,result.real+"+"+ result.imaginary+"i"); //equate the expected result and the actual result
	}

}
