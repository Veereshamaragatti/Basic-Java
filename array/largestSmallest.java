public class largestSmallest {
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;//- infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }

        }
        return largest;
    }
    public static int  smallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={10,2,3,40,50,6};
        System.out.println("the smallest number in an array is "+smallest(numbers));
        System.out.println("the largest number in an array is "+largest(numbers));
        System.out.println("length of an array "+numbers.length);//length will always start from 1 
    }
}
