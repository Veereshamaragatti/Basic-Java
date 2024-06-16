public class zero_one_triangle {
    public static void z_o_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){ //if((i-j)==0 || (i-j)==2 || (i-j)==4){ my logic
                    System.out.print("1 ");
                }else{
                    System.err.print("0 ");
                }
            }
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        z_o_triangle(5);
    }
}
