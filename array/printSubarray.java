public class printSubarray {
        public static void subarray(int number[]){
            int tp=0;
           for(int i = 0; i < number.length; i++) {
                for(int j=i;j < number.length; j++){
                    for(int k=i;k<j; k++){
                        System.err.print(number[k]+" ");
                    }
                    tp++;
                    System.out.println();
                }System.out.println();
            System.out.println();
           }
           System.out.println(tp);
        }
        public static void main(String[] args){
            int number[]={10,20,30,40,50,60,70,80};
            subarray(number);
            }
        }
