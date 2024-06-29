import java.util.*;
class R192110718
{
	public static void main(String args[])
	{
		String str="saveetha school of engineering";
		int vcount=0;
		int n=str.length();
		char ch;
		for(int i=0;i<n;i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vcount++;
			}
		}
		System.out.println("No of vowels"+vcount);
	}
}
				