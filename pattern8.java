import java.util.Scanner;
public class NumbersAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        System.out.println("Numbers from 1 to " + n + " and their sum:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum of numbers from 1 to " + n + " is: " + sum);
    }
}
