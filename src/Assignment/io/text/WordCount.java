package Assignment.io.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	int wordCount =0;
	String line = "";
	public int checkNumberOfWords(FileReader fr) throws IOException{
		BufferedReader br = new BufferedReader(fr);
		while((line = br.readLine()) != null){
			String[] words = line.split(" ");
			wordCount = wordCount + words.length;
		}
		return wordCount;
	}
}
