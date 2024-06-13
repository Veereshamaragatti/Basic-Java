import java.util.*;
public class fizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if(num %3 == 0 && num % 5 != 0){
            System.out.println("fizz");
        }
        else if(num %5 == 0 && num % 3 != 0){
            System.out.println("Buzz");
        }
        else if(num % 15 == 0){
            System.out.println("fizzBuzz");
        }
        else{
            System.out.println("sorry");
        }
    }
}


