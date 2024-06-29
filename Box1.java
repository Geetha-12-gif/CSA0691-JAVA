class Box1  
{ 
double width; 
double height; 
double depth; 
Box1(double w, double h, double d) 
{ 
width = w; 
height = h; 
depth = d; 
} 
void volume()  
{ 
double v= width * height * depth; 
System.out.print("Volume of Box = "+v); 
} 
public static void main(String[] args)  
{ 
Box1 myBox = new Box1(10.5, 15.5, 20.5); 
myBox.volume(); 
} 
} 