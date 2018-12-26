import java.util.*;
class Linearsearch
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no.of elements:");
		int n=in.nextInt();
		System.out.println("Enter the Elements:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter the search element:");
		int k=in.nextInt();
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				System.out.println("Searched element is present at "+(i+1)+"th position");
				break;
			}	
		}
		if(i==n)
		System.out.println("Searched element is not present");
	}
}