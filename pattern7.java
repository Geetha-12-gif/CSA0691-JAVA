import java.util.Scanner;
public class OddNumbersAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();
        int sum = 0;
        System.out.println("Odd numbers from 1 to " + n + " and their sum:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum of odd numbers from 1 to " + n + " is: " + sum);
    }
}
