import java.util.*;
class PAS1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,j,k,n,c=1;
System.out.println("enter the number");
n=sc.nextInt();
for(i=0;i<=n;i++)
{
 for(j=1;j<=n-i;j++)
 {
  System.out.print(" ");
}
for(k=0;k<=i;k++)
{
 if(i==0||k==0)
{ 
 c=1;
}
else
{
c=c*(i-k+1)/k;
}
System.out.print(" "+c);
}
System.out.println();
}
}
}