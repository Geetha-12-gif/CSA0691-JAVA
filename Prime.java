import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=Sc.nextInt();
		for(int i=2;i<=10;i++)
		{
			if(n%i==1)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("It is a composite number");
				break;
			}
		}
	}
}