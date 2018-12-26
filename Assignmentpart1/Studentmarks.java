import java.util.*;
class Studentmarks
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter student name:");
			String studentName=in.next();
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter Subject "+(j+1)+" marks");
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{ 
			int totalScore=0;
			for(int j=0;j<a[i].length;j++)
			{
				totalScore=totalScore+a[i][j];
			}
			System.out.println("TotalScore for Student "+(i+1)+" is "+totalScore);
			System.out.println("AverageScore for student "+(i+1)+" is: " +(totalScore/a.length));
		}
	}
}

