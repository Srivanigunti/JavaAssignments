package Assignment.io.text;

import java.io.File;

public class FileExist {
	public boolean fileFoundCheck(File findFile)
	{
		if (findFile.exists())
		{
			return true;
		}
		else
			return false;
	}
}