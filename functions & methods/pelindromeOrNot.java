public class pelindromeOrNot {
    public static double  isPelindrome(int num){
        while(num>0){
            double rev=0;
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        
    }
}
