import java.util.*;
class Arithmetic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        try {
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
            int difference = num1 - num2;
            System.out.println("Difference: " + difference);
            int product = num1 * num2;
            System.out.println("Product: " + product);
            if (num2 == 0) {
                throw new Arithmetic("Division by zero is not allowed.");
            }
            int quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
            
        } catch (Arithmetic e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
