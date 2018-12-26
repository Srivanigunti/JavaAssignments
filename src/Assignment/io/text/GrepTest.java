package Assignment.io.text;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class GrepTest {
	private Grep searchWord;

	@Test
	public void testForSearchingWord() throws IOException {
		searchWord = new Grep();
		FileReader fr = new FileReader("C:\\Users\\srgunti\\Desktop\\Demo\\Srivani.txt");
		String wordToSearch ="Srivani";
		String actualLineNumberAndTheLine = searchWord.findLineNumberAndLine(fr,wordToSearch);
		String expectedLineNumberAndTheLine = "2 Am Srivani\n5 Srivani is a very good girl.\n";
		assertEquals(expectedLineNumberAndTheLine , actualLineNumberAndTheLine);
	}

}
