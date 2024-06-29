class cube
{
public static void main(String[] args)
{
 int n=12;
int i;
for(i=0;i<n;i++)
{
if(i*i*i == n)
{
 System.out.println("true :"+i);
}
else
{
System.out.println("false");
break;
}
}
}
}