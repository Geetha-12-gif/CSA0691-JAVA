import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		String str="saveetha";
		String rev=" ";
		char ch;
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			ch=str.charAt(i);
			rev=rev+ch;
		if(rev.equals(str))
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("is not a palindrome");
                        break;
		}
		}
	}
}