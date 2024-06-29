import java.util.Scanner;
public class SquareArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double a = input.nextDouble();
        double area = a*a;
        System.out.println("The area of the square with side length " + a + " is: " + area);
        input.close();
    }
}
