package Assignment.io.text;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class NumberOfLinesTest {
	private LineCount numberOfLines;

	@Test
	public void testForCountingNumberOfLines() throws IOException {
		numberOfLines = new LineCount();
		FileReader fr = new FileReader("C:\\Users\\srgunti\\Desktop\\Demo\\Srivani.txt");
		int numberOfLinesInFile =numberOfLines.checkNumberOfLines(fr);
		int expected = 3;
		assertEquals(expected, numberOfLinesInFile);
	}

}
