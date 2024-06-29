import java.util.*;
class btd
{
	public static void main(String args[])
	{
		int b=1010;
		int d=0,base=1,i=0,r;
		while(b!=0)
		{
		r=b%10;
		b=b/10;
		d+=r* Math.pow(2,i);
		i++;
		}
		System.out.println("binary to decimal conversion="+d);
	}
}