public class sorting {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("the sorted array is using bubblesort :\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+"\n");
        }
    } 
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
                int temp=arr[i];
                arr[i]=arr[minPos];
                arr[minPos]=temp;
            }
        }
        System.out.println("the sorted array using selection sort :\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+"\n");
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.println("the sorted array using insertion sort :\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+"\n");
        }
    }
    public static void main(String[] args){
        int arr[]={10,2,30,4};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }
}
