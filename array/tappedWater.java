public class tappedWater {
    public static int totalWater(int heights[]){
        int n = heights.length;
        
        if (n < 3) {
            return 0;  // No water can be trapped if there are less than 3 bars
        }

        int leftMax[] = new int[heights.length];
        leftMax[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        int rightMax[] = new int[heights.length];
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }

        int tappedWater = 0;
        for (int i = 1; i < n - 1; i++) {  // Avoid first and last element
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            tappedWater += waterLevel - heights[i]; 
        }

        return tappedWater;
    }

    public static void main(String[] args) {
        int heights[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = totalWater(heights);
        System.out.println("Total water trapped: " + result);
    }
}
