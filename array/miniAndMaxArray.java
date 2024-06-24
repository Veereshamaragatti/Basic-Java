public class miniAndMaxArray {
    public static int mini(int s[]){
        int n=s.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(s[i]<min){
                min=s[i];
            }
        }
        return min;
    }
    public static int max(int s[]){
        int n=s.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(s[i] > maxi){
                maxi = s[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int s[]={1,2,3,4,5};
        System.out.println(max(s));
        System.out.println(mini(s)); 
    }
}
