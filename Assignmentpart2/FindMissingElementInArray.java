
public class FindMissingElementInArray 
{

	public int[] missingElement;

	public int missingElement(int numbers[])
	{
		//sorting
		for(int i=0; i<numbers.length; i++)
		{
			for(int j = 0 ; j<numbers.length-1 ; j++ )
			{
				if(numbers[j] > numbers[j+1])
				{
					int temporaryVariable= numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temporaryVariable;
				}
			}
		}
		//finding missing element
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]!=i)
			{
				return i;
			}
		}
		return numbers.length;
	}
}
