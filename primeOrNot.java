import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n==2){
            System.out.println("prime number");
        }else{
            for(int i=2;i<n-1;i++){//u can write root n for low time complexity math.sqrt(n) or i*i<=n
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }
        
    }
}