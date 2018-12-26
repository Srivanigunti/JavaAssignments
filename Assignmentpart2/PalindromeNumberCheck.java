
public class PalindromeNumberCheck 
{
	public boolean ReverseOfNumber(int palindrome) 
	{
		int reverse=0;
		int temp=palindrome;
		if(palindrome>=10)
		{
			while(palindrome!=0)
			{
				int remainder = palindrome % 10;
				reverse = reverse * 10 + remainder ;
				palindrome=palindrome/10;
			}
			return reverse==temp;
		}
		else
			return false;
	}

}
