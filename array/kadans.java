class kadans {
    public static void maxSubArray(int[] nums) {
      int n = nums.length;
      int currSum = 0;
      int maxSum = Integer.MIN_VALUE;
      for (int i = 0; i < n; i++) {
      currSum += nums[i];
        if (currSum < 0) {
          currSum = 0;
        }
        maxSum = Math.max(maxSum, currSum);
      }
      System.out.println(maxSum);
    }
  
    public static void main(String[] args){
          int nums[]={-2,1,-3,4,-1,2,1,-5,4};
          maxSubArray(nums);
  
      }
  }