public class CountSort {
    public static void countSort(int arr[]){
        int n=arr.length;
        int mx=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=mx){
                mx=arr[i];
            }
        }
        int count[]=new int[mx+1];
            for(int i=0;i<n;i++){
                int element=arr[i];
                count[element]++;
            }
            int k=0;
            for(int i=0;i<=mx;i++){
                int freq=count[i];
                for(int j=0;j<freq;j++){
                    arr[k]=i;
                    k++;
                }
            }
            System.out.println("the sorted array is");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
    }
    public static void main(String[] args){
        int arr[]={5,5,3,6,11,1,9,8,6,6};
        countSort(arr);
    }
}