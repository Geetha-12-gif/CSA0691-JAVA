import java.util.*;
class reverse
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
		}
		System.out.print("Reverse string"+rev);
	}
}