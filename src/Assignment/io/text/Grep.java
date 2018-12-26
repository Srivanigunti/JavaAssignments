package Assignment.io.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
	public String findLineNumberAndLine(FileReader fr, String wordToSearch) throws IOException{
		String lineNumberAndLine= "";
		String line = "";
		int lineNumber = 0;
		BufferedReader br = new BufferedReader(fr);
		while ((line = br.readLine()) != null)
		{
			lineNumber++;
			String[] words = line.split(" ");
			for(int counter = 0; counter < words.length; counter++)
			{
				if(words[counter].equals(wordToSearch))
				{
					lineNumberAndLine += lineNumber+" "+line+"\n";
					
				}
			}
		}
		return lineNumberAndLine;
	}
}
