public class fibonacci {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int n=10;
        for(int i=0;i<n;i++){
                System.out.println(first+"");
                int third = first + second ;
                first = second;
                second = third;            
        }
        //System.out.println(second+""); if u need the sum of fibonacchi
    }
}
