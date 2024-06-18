public class binarySearch {
        public static int  search(int number[],int key){
            int start=0;
            int end=number.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(number[mid]==key){
                    return mid;
                }
                if(number[mid]<key){
                    start=mid+1;
                }
                if(number[mid]>key){
                    end=mid-1;
                }
            }
            return -1;
        }
        public static void main(String[] args){
            int number[]={10,20,30,40,50,60,70,80};
            int key=50;
            int index=search(number, key);
            if(index == -1){    
                System.out.println("not found"); 
            }
            else{
                System.out.println("the number found at key "+index);
            }
        }
    }