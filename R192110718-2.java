import java.util.*;
class volume
{
	int a,l,b,h;
	volume()
	{
		l=20;
		b=20;
		h=20;
	}
	void calculate()
	{
		a=l*b*h;
	}
	void display()
	{
		System.out.println("volume of box="+a);
	}
}
public static void main(String args[])
{
	volume v=new v();
	v.calculate();
	v.display();
}