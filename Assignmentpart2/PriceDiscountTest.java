import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PriceDiscountTest 
{
	private PriceDiscount priceDiscount;
	
	@Before 
	public void setUp()
	{
		priceDiscount = new PriceDiscount();
	}
	
	@Test
	public void testDiscountCheck() 
	{
		double newItem= 150, discountPercentage=35;
		double discountAmountValue = priceDiscount.discountFind(newItem,discountPercentage);
		assertEquals(52.5, discountAmountValue,.00001);
	}
	
	@Test
	public void testNewDiscountCheck() 
	{
		double newItem= 150, discountPercentage=35;
		double newPriceAmountValue = priceDiscount.newPriceFound(newItem,discountPercentage);
		assertEquals(97.5, newPriceAmountValue,.00001);
	}

}
