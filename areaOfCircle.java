
import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        System.out.println("Area of circle");
        System.out.println("Enter the value of radius");
        float pi = 3.14F;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float Area = pi*r*r;
        System.out.printf("the area of circle is"+Area);
    }
}
