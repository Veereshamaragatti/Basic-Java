public class sameDifferentRepeat{
    public static boolean diffSame(int[] num){
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println(diffSame(num));
    }
}