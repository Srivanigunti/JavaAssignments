package Assignment.io.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	int count =0;
	public int checkNumberOfLines(FileReader fr) throws IOException{
		BufferedReader br = new BufferedReader(fr);
		while(br.readLine() != null){
			count++;
		}
		return count;
		
	}
}
