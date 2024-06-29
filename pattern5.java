import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= input.nextInt();
        int org = n;
        int rev= 0;
        int rem;
        while (n!= 0) {
            rem = n % 10;
            rev = rev* 10 + rem;
            n /= 10;
        }
        if (org == rev) {
            System.out.println("The number " + org + " is a palindrome.");
        } else {
            System.out.println("The number " + org + " is not a palindrome.");
        }
    }
}
