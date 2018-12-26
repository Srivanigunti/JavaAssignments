
public class DifferenceNumberPresence {

	public boolean findNumber(int[] numbers, int value) {
		boolean result= false;
		for(int counter= 0; counter< numbers.length;counter++)
		{
			for(int counterOne=0;counterOne<numbers.length;counterOne++)
			{
				int difference = numbers[counter]-numbers[counterOne];
				if(difference==value)
					result = true;
			}
		}
		return result;
	}

}
