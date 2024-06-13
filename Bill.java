import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pen");
        int a = sc.nextInt();
        System.out.println("Enter the price of pencil");
        int b = sc.nextInt();
        System.out.println("Enter the price of eraser");
        int c = sc.nextInt();
        int sum = a+b+c;
        float gst = sum*0.18f;//18% gst
        float bill = sum+gst;
        System.out.printf("u have to pay "+bill);
    }
}
