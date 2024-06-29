

import java.util.*;

public class arraymulthread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int a[] = new int[n];
        try {
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            System.out.println("Sum is:" + sum);
        } catch (Exception ex) {
            System.out.println("morethan than n values");
            System.out.println("Change n value");
        } finally {
            System.out.println("Always accepted");
        }
    }
}