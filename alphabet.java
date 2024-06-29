import java.util.*;
class alphabet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		Character ch=sc.nextLine().charAt(0);
		int l=0,u=0,num=0;
		while(ch!='*')
		{
			if(ch>='A' && ch<='Z')
			u++;
			if(ch>='a' && ch<='z')
			l++;
			if(Character.isDigit(ch))
			num++;
			System.out.println("Enter any character");
			ch=sc.next().charAt(0);
		}
			System.out.println("Total no of lower cas"+l);
			System.out.println("Total no of upper cas"+u);
			System.out.println("Total no of numbers cas"+num);
	}
}
			
		
		