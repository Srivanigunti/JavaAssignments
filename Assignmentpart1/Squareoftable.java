import java.lang.Math;
class Tablesquare
{
	public static void main(String args[])
	{
		int number=6,multiplicationResult,square;
		for(int i=1;i<=10;i++)
		{
			multiplicationResult=number*i;
			square=(int) Math.pow(multiplicationResult,2);
			System.out.println(number+"*"+i+"="+multiplicationResult+"---"+square);
		}
	}
}