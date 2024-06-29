import java.util.Scanner;

public class FirstNOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        System.out.print("Hence the values printed for i are ");
        int count = 0;
        int i = 1; // Start with the first odd number
        
        while (count < N) {
            if (i % 2 != 0) { // Check if i is odd
                if (count == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" , " + i);
                }
                count++;
            }
            i++;
        }
        
        scanner.close();
    }
}
