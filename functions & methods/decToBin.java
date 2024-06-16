public class decToBin {
    public static void toBin(int num){
        int rem=0;
        int pow=0;
        int myBin=0;
        while(num>0){
            rem=num%2;
            myBin=myBin+(rem*(int)Math.pow(10,pow));
            pow++;
            num=num/2;
        }
        System.out.print(myBin);
    }
    public static void main(String[] args) {
        toBin(11);
    }
}
