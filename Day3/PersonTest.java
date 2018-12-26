import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;


public class PersonTest 
{
	private String name; // data member to store the name of a person.
	private Date dob; // data member to store the date of birth of a person.

	@Test
	public void displayTest() // method to display the details of a person.
	{
		Person person1 = new Person("Srivani", 18, 06, 1996);
		Person person2 = new Person("Varun", 22, 9, 1994);
		person1.display();
		person2.display();
	}
	
	public void olderOne(Person p)
	{
		
		/*if(person1.dob > person2.dob)
		{
			result = person1.dob - person2.dob;
			
			System.out.println("Person1.name is older than person2.name by:",  person1.dob-person2.dob);
		}
		else
			System.out.println("Person2.name is older than person1.name by (person2.dob-person1.dob)");*/
	}

}


/*
	public void olderOne(Person p) //method to identify the older of the two persons.
	{
		//Older one of the invoking and given person object is identified and its details are 
		//displayed in the following format:
		//.... is older than .... by ... years, ... months and ... days.
	}
}
*/