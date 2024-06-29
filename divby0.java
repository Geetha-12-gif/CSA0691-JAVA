

import java.util.*;

public class divby0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int x = a / b;
            System.out.println("Output is:" + x);
        } catch (Exception ex) {
            System.out.println("Division by zero error");
            System.out.println("change b value");
        } finally {
            System.out.println("Always executed");
        }
    }
}