public class topRight {
    public static void main(String[] args) {
        int n=6;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(col-row>=0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
