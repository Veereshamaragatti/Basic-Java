public class primeInRange {
    public static boolean isPrime(int n){
        boolean Prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                Prime=false;
            }
        }
        return Prime;
    }
    public static void primeRange(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        }
    public static void main(String[] args) {
     primeRange(50);   
    }
}
