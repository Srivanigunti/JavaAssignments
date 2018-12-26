package Assignment.io.text;

import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeWriteTest {
	private EmployeeWrite employee;
	
	@Before
	
	public void setup() {
		employee=new EmployeeWrite(101,"Srivani", 10000);
	}

	@Test
	public void testForWritingDetails() {
		String actual=employee.toString();
		try {
			FileWriter fileWriter=new FileWriter("C:/Srivani/Junit/CoreJavaAssignments/src/sri.txt");
			fileWriter.write(actual);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}