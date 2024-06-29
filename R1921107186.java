import java.util.Scanner;
class R1921107186 {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 =5;
        System.out.println("Addition: " + (num1+num2));
        System.out.println("Subtraction: " +( num1-num2));
        System.out.println("Multiplication: " +( num1*num2));
        try {
            System.out.println("Division: " + (num1/num2));
        } catch (ArithmeticException e)
	 {
            System.out.println("Error: " + e.getMessage());
        }

    }

   
    
}