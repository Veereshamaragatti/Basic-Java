public class pelindromeString {
    public static boolean isPalindrome(String s) {
        String S = s.toLowerCase().replace(" ","");
        int n=S.length();
        for(int i=0;i<S.length()/2;i++){
            if(S.charAt(i) != S.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
