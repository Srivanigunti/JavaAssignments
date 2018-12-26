
public class PriceDiscount 
{

	public double discountFind(double newItem, double discountPercentage) 
	{
		double discountAmount=((discountPercentage*newItem)/100);
		return discountAmount;
	}
	
	public double newPriceFound(double newItem, double discountPercentage) 
	{
		double newPriceAmount=newItem-((discountPercentage*newItem)/100);
		return newPriceAmount;
	}
}
