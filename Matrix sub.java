import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= input.nextInt();
        int org = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;
        int digit;
        while (n> 0) {
            digit = n% 10;
            sum += Math.pow(digit, numDigits);
            n/= 10;
        }
        if (sum == org) {
            System.out.println(org+ " is an Armstrong number.");
        } else {
            System.out.println(org + " is not an Armstrong number.");
        }
    }
}
