
public class RemoveDuplicates {

	public String removeChar(String input) {
		String afterRemovalOfDuplicates = new String();
		int size =input.length();
		int counter = 0;
		for(int counte=0; counter<size ; counter++)
		{
			if(!afterRemovalOfDuplicates.contains(String.valueOf(input.charAt(counter))))
			{
				afterRemovalOfDuplicates+=String.valueOf(input.charAt(counter));
			}
		}
		/*
		for(int i=0 ; i<chars.length;i++) //sorting
		{
			char temp=' ';
			for(int j=i+1;j<chars.length;j++)
			{
				if(chars[i]>chars[j])
				{
					temp = chars[i];
					chars[i]=chars[j];
					chars[j]= temp;
				}
			}
		}
		int temp2=0;
		for(int i=0 ; i<chars.length;i++)
		{
			if(chars[i]!=chars[i+1])
			{
				chars[temp2]=chars[i];
				temp2++;
			}
		}
		chars[temp2]=chars[chars.length-1];
		char newArray[]=new char[temp2+1];
		for(int i=0; i<newArray.length;i++)
		{
			newArray[i]=chars[i];
		}
		String str=new String(newArray);
		return str;
		*/
		return afterRemovalOfDuplicates;
	}

}
