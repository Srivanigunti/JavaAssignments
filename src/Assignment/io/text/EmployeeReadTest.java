package Assignment.io.text;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeReadTest {
	private EmployeeRead employeeRead;
	
	@Before
	public void setUp(){
		employeeRead = new EmployeeRead();
	}
	
	@Test
	public void testForReadingEmployee() throws IOException {
		FileReader fileReader ;
		try{
			fileReader = new FileReader("C:\\Users\\srgunti\\Desktop\\Demo\\Srivani.txt");
			String employeeDetails = employeeRead.employeeRead(fileReader);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	}

}
