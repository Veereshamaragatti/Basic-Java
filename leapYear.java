
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4==0)&&(year%100==0)&&(year%400==0)){
            System.out.println("this is leap year");
        }
        else if((year%4==0)&&(year%100!=0)){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("this is not leap year");
        }
    }
}
