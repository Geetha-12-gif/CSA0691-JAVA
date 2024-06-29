class revno
{
	public static void main(String args[])
	{
		int n=14567;
		double rev=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
	System.out.println("reverse"+rev);
	}
}