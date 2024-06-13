
import java.util.Scanner;

public class sumOfNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i =0;
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
