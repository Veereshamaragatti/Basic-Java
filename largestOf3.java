import java.util.*;

public class largestOf3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        if((a>=b && a>=c)){
            System.out.println("A is largest");
        }
        else if(b>=c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
}
