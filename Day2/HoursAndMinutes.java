
public class HoursAndMinutes 
{
	int hours;
	int minutes;
	public HoursAndMinutes(int hours, int minutes) 
	{
		this.hours=hours;
		this.minutes=minutes;
	}
	public HoursAndMinutes() 
	{
		
	}
	public static HoursAndMinutes sum(HoursAndMinutes time, HoursAndMinutes time1) 
	{
		HoursAndMinutes result = new HoursAndMinutes();
		result.hours=time.hours+time1.hours;
		if(result.hours>=24)
		{
			System.out.println("addition of hours cannot be more than 24 hours in a day");
		}
		else
		{
			result.hours = time.hours+time1.hours;
		}
		result.minutes=time.minutes+time1.minutes;
		if(result.minutes>60)
		{
			result.hours++;
			result.minutes=result.minutes-60;
		}
		else
		{
			result.minutes=time.minutes+time1.minutes;
		}
		return result;
	}
	
	public void display()
	{
		System.out.println(hours+" hrs "+minutes+" min");
	}
}