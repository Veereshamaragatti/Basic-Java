public class MaxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        double windowSum = 0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        // Slide the window over the array
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("Maximum average subarray: " + findMaxAverage(nums, k));
    }
}
