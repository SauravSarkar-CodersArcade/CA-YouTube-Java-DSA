package CodersArcade.Arrays;
public class BasicArray {
    public static void main(String[] args) {
        // 1 D Array
        // datatype[] arrayName = new datatype[arraySize];
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers.length);

        // 2D Array
        // // datatype[][] arrayName = new datatype[r][c];
        String[][] matrix = new String[3][4];
        matrix[0][0] = "Coders Arcade";
        System.out.println(matrix[0][1]);
        for (int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] mat = {{1, 2, 3, 4}, // row 0
                       {4, 5, 6, 7}, // row 1
                       {7, 8, 9, 0}}; // row 2 Array of arrays
        for (int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // MD Arrays
        // Jagged Arrays
    }
}
