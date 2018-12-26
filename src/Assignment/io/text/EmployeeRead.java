package Assignment.io.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class EmployeeRead implements Serializable {
	public String employeeRead(FileReader fileReader) throws IOException{
		String line = "";
		String result = " ";
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while((line = bufferedReader.readLine()) != null){
			result += line;
		}
		return result;
		
	}

}
