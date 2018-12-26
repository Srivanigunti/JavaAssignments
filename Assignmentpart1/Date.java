import java.util.Scanner;
class Date
{
	public static void main(String srgs[])
	{
		String date,month,year;
		String MonthName=" ";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter MM");
		month=sc.nextLine();
		System.out.println("Enter DD");
		date=sc.nextLine();
		switch(month)
		{
			case "01":
			MonthName="January";
			break;
			case "02":
			MonthName="February";
			break;
			case "03":
			MonthName="March";
			break;
			case "04":
			MonthName="April";
			break;
			case "05":
			MonthName="May";
			break;
			case "06":
			MonthName="June";
			break;
			case "07":
			MonthName="July";
			break;
			case "08":
			MonthName="August";
			break;
			case "09":
			MonthName="September";
			break;
			case "10":
			MonthName="October";
			break;
			case "11":
			MonthName="November";
			break;
			case "12":
			MonthName="December";
			break;
		}
		System.out.println("Enter Year");
		year=sc.nextLine();
		System.out.println(date+"/"+MonthName+"/" +year );
	}
}