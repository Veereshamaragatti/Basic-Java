import java.util.Scanner;
public class positiveOrNegetive {
    public static void main(String[] args) {
        System.out.println("Enter the value to check whwther it is positive or negative");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("A is even number");
        }
        else
        System.out.println("A is odd number");
    }
}
