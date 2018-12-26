import java.util.Scanner;
class Incometax
{
	public static void main(String srgs[])
	{
		int taxPercentage=0, taxAmount=0;
		String slab=" ";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the CTC:");
		int CTC=sc.nextInt();
		if(CTC>0 && CTC<=180000)
		{
			taxPercentage=0;
			slab="SlabA";
		}
		else if(CTC>=181001 && CTC<=300000)
		{
			taxPercentage=10;
			slab="SlabB";
		}
		else if(CTC>=300001 && CTC<=500000)
		{
			taxPercentage=20;
			slab="SlabC";
		}
		else if(CTC>=500001 && CTC<=1000000)
		{
			taxPercentage=30;
			slab="SlabD";
		}
		taxAmount=(taxPercentage*CTC)/100;
		System.out.println("Tax Amount is:" +taxAmount);
	}	
}