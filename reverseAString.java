public class reverseAString {
    public static void main(String[] args){
        String s="veeresh";
        int n=s.length();    
        String r ="";
        for(int i=n-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        System.out.println(r);
    }
}
