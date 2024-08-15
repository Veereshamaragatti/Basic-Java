class maxWater {
    public static int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left < right){
            int length=Math.min(height[left],height[right]);
            int bredth=Math.abs(right-left);
            int area = length * bredth;
            max = Math.max(area,max);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}