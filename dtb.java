import java.util.*;
class dtb
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=10,b=0,c=0;
		while(n!=0)
		{
			b+=(n%2)* Math.pow(10,c);
			n=n/2;
			c++;
		}
		System.out.println("decimal to binary conversion="+b);
	}
}