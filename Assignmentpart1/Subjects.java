import java.util.Scanner;
class Result
{
	public static void main(String srgs[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks of first subject:");
		int subjectOne=sc.nextInt();
		System.out.println("Enter marks of second subject:");
		int subjectTwo=sc.nextInt();
		System.out.println("Enter marks of third subject:");
		int subjectThree=sc.nextInt();
		int total=(subjectOne+subjectTwo+subjectThree)/3;
		int passmarkOne=(subjectOne+subjectTwo)/2,
		passmarkTwo=(subjectOne+subjectThree)/2,
		passmarkThree=(subjectTwo+subjectThree)/2;
		if(total>=60 )
		{
			System.out.println("passed");
		}
		else if(passmarkOne>=60  || passmarkTwo>=60 || passmarkThree>=60)
		{
			System.out.println("promoted");
		}
		else
		{
			System.out.println("failed");
		}
	}
}