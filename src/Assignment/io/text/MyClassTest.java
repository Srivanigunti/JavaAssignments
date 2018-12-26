package Assignment.io.text;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest {
	private MyClass myClass;
	private MyClass myClass1;
	private MyClass myClass2;
	private MyClass myClass3;
	private MyClass myClass4;
	
	
	@Before
	public void setup() {
		myClass =new MyClass();
		myClass1=new MyClass();
		myClass2=new MyClass();
		myClass3=new MyClass();
		myClass4=new MyClass();
	}

	@Test
	public void test() {
		try {
			FileReader fileReader=new FileReader("C:/Srivani/Junit/CoreJavaAssignments/src/Srivani.txt");
			String details=myClass.myClass();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}