
import java.util.Scanner;

public class productAB {
    public static void main(String[] args) {
        System.out.println("product of two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        System.out.printf("the product of " + a + " and " + b + " is " + c);
    }
}
