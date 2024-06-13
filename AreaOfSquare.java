import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        System.out.println("Area of Square");
        System.out.println("Enter the side value");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int Area=a*a;
        System.out.printf("the area of square is "+Area);
    }
}
