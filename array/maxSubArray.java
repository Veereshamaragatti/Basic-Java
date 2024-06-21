public class maxSubArray {
    public static void MaxSubArray(int number[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += number[k];
                }
                System.out.println("Current subarray sum from index " + i + " to " + j + " is: " + currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maximum sum of subarray is " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        MaxSubArray(number);
    }
}
