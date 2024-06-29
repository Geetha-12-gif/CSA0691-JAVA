class A 
{ 
 int i,j; 
 A(int a,int b) 
 { 
  i=a; 
  j=b; 
  System.out.println("baseclass constructor"); 
 } 
 void show() 
 { 
  System.out.println("i = "+i+" j = "+j); 
 } 
} 
class B extends A 
{ 
 int k; 
 B(int a,int b,int c) 
 { 
  super(a,b); 
  k=c; 
  System.out.println("subclass constructor"); 
 } 
 void show()  
 { 
  super.show(); 
  System.out.println("i = "+i+" j = "+j+" k = "+k); 
 } 
} 
class Override 
{ 
 public static void main(String arg[]) 
 { 
  B b=new B(100,200,300); 
  b.show(); 
 } 
} 