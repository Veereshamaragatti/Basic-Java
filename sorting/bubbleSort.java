public class bubbleSort {
    public static void sort(int arr[]){
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("the sorted elements are :");
        for(int i=0;i<n;i++){
            System.out.println(""+arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,1,5,0};
        sort(arr);
    }
}
