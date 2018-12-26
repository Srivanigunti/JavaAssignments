import java.util.*;
class Sequentialsort
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array");
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
		System.out.println("After sorting elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}