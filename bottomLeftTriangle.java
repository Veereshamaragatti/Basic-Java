public class bottomLeftTriangle {
    public static void main(String[] args) {
        int n=6;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row-col>=0){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
