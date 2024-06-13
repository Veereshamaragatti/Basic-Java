
import java.util.Scanner;

public class sumAB {
    public static void main(String[] args) {
        System.out.println("Addition of two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.printf("the sum of " + a + " and " + b + " is " + c);
    }
}
