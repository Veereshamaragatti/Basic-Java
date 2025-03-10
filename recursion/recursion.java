public class recursion{
    public static int firstOccur(int[] arr,int target){
        int i=0; 
        if(arr[i]==target){
        System.out.println(i);
        i++;
      }  
      else{
        System.out.println(-1);
      }
      return i;
    }
    public static int lastOccur(int[] arr,int target,int i){
        int foundLast = lastOccur(arr, target,i+1);
        if(foundLast != -1 && arr[i]==target){
            return i;
        }
        return foundLast;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        firstOccur(arr,target);
    }
}