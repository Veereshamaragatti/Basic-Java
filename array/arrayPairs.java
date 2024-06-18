public class arrayPairs {
    public static void pairs(int number[]){
        int tp=0;
       for(int i = 0; i < number.length; i++) {
           int curr=number[i];
           for(int j=i+1; j < number.length; j++){
            System.out.print("("+curr+","+number[i]+")");
            tp++;
           }
           System.out.println(" ");
       }
       System.out.println(tp);
    }
    public static void main(String[] args){
        int number[]={10,20,30,40,50,60,70,80};
        pairs(number);
        }
    }
