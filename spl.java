class spl
{
public static void main(String args[])
{
String str="!@#$%^&*()";
char ch;
int special=0;
int n=str.length();
for(int i=0;i<n;i++)
{
ch=str.charAt(i);
if(!(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '0'))
{special++;
}
}
System.out.println("special characters"+special);
}
}
