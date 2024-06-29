import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int n1,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			sum=sum+n1;
			n=n/10;
		}
	System.out.println("sum="+sum);
	}
}