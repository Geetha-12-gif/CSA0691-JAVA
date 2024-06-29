import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double l = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double b = input.nextDouble();
        double area = l * b;
        System.out.println("The area of the rectangle with length " + l + " and width " + b + " is: " + area);
        input.close();
    }
}
