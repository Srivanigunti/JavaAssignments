import java.util.Scanner;
class Validation
{
	public static void main(String[] args)
	{
		int count=0;	
		String Name="Srivani";
 		int Pw=12345;
		for(int i =1;i<=3;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User Name:-");
			String UserId=sc.nextLine();
			System.out.println("Enter Password:-");
			int Password = sc.nextInt();
			if(Name.equals(UserId) && Pw==Password)
			{
				System.out.println("Welcome "+ Name);
				break;
			}
			else
			{
				count++;
				System.out.println("Try Again...");
			}
		}	
 		if(count==3)
		{
			System.out.println("Contact Admin... ");
		}
	}
}