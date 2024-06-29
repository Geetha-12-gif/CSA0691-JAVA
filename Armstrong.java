import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		int n=153;
		int i,rem;
		int temp=n;
		double rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev+Math.pow(rem,3);
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("Is a Armstrong number="+temp);
			
		}
	}
}