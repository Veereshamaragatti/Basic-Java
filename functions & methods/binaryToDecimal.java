public class binaryToDecimal {
    public static void binToDec(int n){
        int myNum = n;
        int pow = 0;
        double dec = 0;

        // Process each digit of the binary number
        while (n > 0) {
            int lastDig = n % 10;
            dec = dec + (lastDig * Math.pow(2, pow));
            pow++;
            n = n / 10;
        }

        System.out.println("The decimal of " + myNum + " = " + (int)dec);
    }

    public static void main(String[] args) {
        binToDec(101101);
    }
}
