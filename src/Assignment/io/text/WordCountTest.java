package Assignment.io.text;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class WordCountTest {
	private WordCount numberOfWords;

	@Test
	public void testForWordCount() throws IOException  {
		numberOfWords = new WordCount();
		FileReader fr = new FileReader("C:\\Users\\srgunti\\Desktop\\Demo\\Srivani.txt");
		int numberOfWordsInFile =numberOfWords.checkNumberOfWords(fr);
		int expected = 6;
		assertEquals(expected, numberOfWordsInFile);
	}

}
