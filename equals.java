import java.util.*;
class equals
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String rev=" ";
		char ch;
		String s1,s2;
		System.out.println("Enter the username:");
		s1=sc.nextLine();
		System.out.println("Enter the Reusername:");
		s2=sc.nextLine();
		if(s1.equals(s2))
		{
			System.out.println("Valid username");
		}
		else
		{
			System.out.println("Invalid username");
		}
	}
}