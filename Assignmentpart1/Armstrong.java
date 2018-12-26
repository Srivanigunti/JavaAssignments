import java.lang.Math;
class Armstrongnumber
{
	public static void main(String[] args)
	{
		int number=153, temp=0, remainder, result=0;
		temp=number;
		while(temp!=0)
		{
			remainder= temp%10;
			result+= Math.pow(remainder, 3);
			temp/=10;
		}
		if(result==number)
		{
			System.out.println(result+ " is an Armstrong number");
		}
		else
		{
			System.out.println(result+ " is not an Armstrong number");
		}
	}
}