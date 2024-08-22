public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
                int curr=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>curr){
                    arr[j+1]=arr[j];
                    j--;                    
            }
            arr[j+1]=curr;
        }
    }
    public static void main(String[] args){
        int arr[]={5,6,7,1};
        insertionSort(arr);
    }
}
