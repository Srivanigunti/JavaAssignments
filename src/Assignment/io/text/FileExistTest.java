package Assignment.io.text;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileExistTest {
	private FileExist fileFoundCheck;
	
	@Test
	public void testForThePresentFile() {
	File findFile = new File("C:\\Users\\srgunti\\Desktop\\Demo\\Srivani.txt");
	fileFoundCheck = new FileExist();
	boolean actualAnswer = fileFoundCheck.fileFoundCheck(findFile);
	assertEquals(true,actualAnswer);
	}
	
	@Test
	public void testForFileNotPresent() {
	File findFile = new File("C:\\Users\\srgunti\\Desktop\\Demo\\Kunni.txt");
	fileFoundCheck = new FileExist();
	boolean actualAnswer = fileFoundCheck.fileFoundCheck(findFile);
	assertEquals(false,actualAnswer);
	}
}
