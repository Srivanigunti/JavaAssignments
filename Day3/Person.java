
public class Person 
{
	private int date;
	private int month;    
	private int year;
	private String name;
	public Person(String name, int date, int month, int year)
	{
		this.name = name;
		this.date = date;
		this.month = month;	
		this.year = year;
	}
	public void display() 
	{
		Person person1 = new Person(name, date, month, year);
		Person person2 = new Person(name, date, month, year); 
		person1.display();
		person2.display();
	}


}
