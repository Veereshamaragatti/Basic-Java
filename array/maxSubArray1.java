public class maxSubArray1 {
    public static void MaxSubArray(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[number.length];
        
        // Initialize the prefix sum array
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        // Calculate the maximum subarray sum
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maximum sum of subarray is " + maxSum);
    }
    public static void kadansAlgo(int number[]) {
        int ms=0;
        int cs=0;
        for(int i=0;i<number.length;i++){
            cs = cs + number[i];
            if(cs < 0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("the maximum sum is " +ms);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        MaxSubArray(number);
        kadansAlgo(number);
    }
}
