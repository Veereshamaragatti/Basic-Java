public class pelindromeOrNot {
    public static boolean  isPelindrome(int num){
        int origionalNum=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return origionalNum == rev;
    }
    public static void main(String[] args) {
        boolean result=isPelindrome(2221);
        System.out.println(result);
    }
}
