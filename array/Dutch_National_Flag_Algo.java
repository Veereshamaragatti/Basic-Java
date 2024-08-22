
import java.util.Arrays;

public class Dutch_National_Flag_Algo {
    public static int[] sortColors(int[] nums) {
        int n=nums.length;
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
         if(nums[mid] == 0){
             swap(nums,mid,low);
             low++;mid++;
         }
         else if(nums[mid] == 1){
             mid++;
         }
         else{
             swap(nums,mid,high);
             high--;
         }
        }
        return nums;
     }
     public static void swap(int nums[],int i,int j){
             int temp = nums[i];
             nums[i] = nums[j];
             nums[j] = temp;
         }
         public static void main(String[] args){
             int nums[]={2,0,2,1,1,0};
             int [] sortedNums = sortColors(nums);
             System.out.print(Arrays.toString(sortedNums));
         }
}
