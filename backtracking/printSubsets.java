public class printSubsets {
    public static void findSubsets(String str, int i, String ans){
        if(i == str.length()){
            if(ans.length() == 0)
                System.out.println("Empty");
            else
            System.out.println(ans);
            return;
        }
        findSubsets(str,i+1,ans+str.charAt(i));
        findSubsets(str,i+1,ans);
    }
    public static void main(String args[]){
        String str = "abc";
        findSubsets(str, 0, "");
    }
}