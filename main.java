class Shape
{
	int r=3;
}
class Sphere extends Shape
{
	double area,volume;
	void calculate()
	{
		area=4*3.14*r*r;
		volume=(4/3)*3.14*r*r*r;
	}
	void display()
	{
		System.out.println("Area of sphere"+area);
		System.out.println("volume of sphere"+volume);
	}
}
class Cone extends Sphere
{
	int l=4;
	int h=6;
	void calculate1()
	{
		area=3.14*r*(l+r);
		volume=(1/3)*3.14*r*r*h;
	}
	void display1()
	{
		System.out.println("Area of cone"+area);
		System.out.println("volume of cone"+volume);
	}
}
class Cylinder extends Cone
{
	void calculate2()
	{
		area=2*3.14*r*(h+r);
		volume=3.14*r*r*h;
	}
	void display2()
	{
		System.out.println("Area of cylinder"+area);
		System.out.println("volume of cylinder"+volume);
	}
}
class main{
public static void main(String args[])
{
Cylinder c = new Cylinder();
c.calculate();
c.display();
c.calculate1();
c.display1();
c.calculate2();
c.display2();
}
}
