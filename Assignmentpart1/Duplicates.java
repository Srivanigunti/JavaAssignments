import java.util.*;
class DuplicateArray
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int temp;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[temp]=a[i];	
				temp++;
			}
		}
		a[temp]=a[a.length-1];
		int newArray[]=new int[temp+1];
		System.out.println("After removing dupalicate elements");
		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}