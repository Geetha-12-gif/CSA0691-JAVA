import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = input.nextInt();
        int a = 0, b = 1;
        int sum;
        System.out.println("Fibonacci sequence:");
        System.out.print(a + " ");
        if (n >= 2) {
            System.out.print(b + " ");
        }
        for (int i = 3; i <= n; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}
