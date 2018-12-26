
public class PalindromeCheckStrings 
{
	String palindromes[] = new String[10];
	public String[] checkPalindrome(String[] input) 
	{
		int newCounter=0;
		for(int counter=0; counter<input.length;counter++)
		{
			String temporaryName="",reverse="";
			temporaryName=input[counter];
			int length=temporaryName.length();
			for(int wordlength = length -1; wordlength >= 0; wordlength--)
			{
				reverse = reverse + temporaryName.charAt(wordlength);
			}
			if(temporaryName.equals(reverse))
			{
				palindromes[newCounter]= input[counter];
				newCounter++;
			}	
		}
		String[] s= new String[newCounter];
		for(int letternumber=0;letternumber<s.length;letternumber++)
		{
			s[letternumber]=palindromes[letternumber];
		}
		return s;
	}

	public int[] lengthOfPalindrome(String[] palindrome) 
	{
		int [] n = new int[palindrome.length];
		for(int letternumber=0;letternumber<n.length; letternumber++)
		{
			n[letternumber] = palindromes[letternumber].length();
		}
		return n;
	}

}
