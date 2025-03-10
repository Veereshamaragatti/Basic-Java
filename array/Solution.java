import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]+1 != nums[i+1]){
                    list.add(nums[i]);
                }
            }else if(i==nums.length-1){
                if(nums[i]-1 != nums[i-1]){
                    list.add(nums[i]);
                }
            }else{
                if(nums[i]+1 != nums[i+1] && nums[i]-1 != nums[i-1]){
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int nums[]={1,3,5,3};
        System.out.println(findLonely(nums));
    }
}
