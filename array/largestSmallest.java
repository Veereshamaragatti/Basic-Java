public class largestSmallest {
    public static int largest(int numbers){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }

        }
        return largest;
    }
    public static int  smallest(int numbers){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }
        return smallest;;
    }
    public static void main(String[] args) {
        int numbers[]={10,2,3,40,50,6};
        smallest(numbers);
        largest(numbers);
    }
}
