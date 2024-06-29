import java.util.*;
class read
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=Integer.parseInt(sc.nextLine());
 		int countpositive = 0, countnegative = 0;
        	double sumpositive = 0, sumnegative = 0;
		while(true)
		{
			System.out.println(n);
			if(n==-1)
			{
			break;
			}
			if(n>0)
			{
				sumpositive+=n;
				countpositive++;
			}
			else if (n<0)
		{
			sumnegative+=n;
			countnegative++;
		}
		}
		double avgp=countpositive>0 ? sumpositive/countpositive:0;
		double avgn=countnegative>0 ? sumpositive/countnegative:0;
		System.out.println("The average of positive numbers is: " + avgp);
        System.out.println("The average of negative numbers is: " + avgn);
	}	
}