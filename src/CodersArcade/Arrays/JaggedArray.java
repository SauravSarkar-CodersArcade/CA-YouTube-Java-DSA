package CodersArcade.Arrays;
public class JaggedArray {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4, 5, 6, 7}, // row 0
                       {4}, // row 1
                       {7, 8, 9}}; // row 2 Array of arrays
        for (int i=0; i<mat.length; i++){ // rows -> i = 0, 1, 2
            for(int j=0; j<mat[i].length; j++){ // cols
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
