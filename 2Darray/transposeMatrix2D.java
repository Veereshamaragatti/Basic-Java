
import java.util.Arrays;

public class transposeMatrix2D {
    public static int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int transposeMatrix[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transposeMatrix[j][i]=matrix[i][j];
            }
        }
        return transposeMatrix;
    }
    public static void main(String[] args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int result[][]=transpose(matrix);
        System.out.println(Arrays.deepToString(result));
    }
}
