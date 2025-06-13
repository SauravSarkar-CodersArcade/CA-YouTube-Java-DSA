package CodersArcade.Arrays;

public class RubiksCube {
    public static void main(String[] args) {
        // 3D Array 6 Faces 3 x 3 Matrix
        String[][][] rubiksCube = new String[6][3][3];
        rubiksCube[0] = new String[][] {{"W","W","W"}, {"W","W","W"}, {"W","W","W"}};
        rubiksCube[1] = new String[][] {{"B","B","B"}, {"B","B","B"}, {"B","B","B"}};
        rubiksCube[2] = new String[][] {{"G","G","G"}, {"G","G","G"}, {"G","G","G"}};
        rubiksCube[3] = new String[][] {{"Y","Y","Y"}, {"Y","Y","Y"}, {"Y","Y","Y"}};
        rubiksCube[4] = new String[][] {{"O","O","O"}, {"O","O","O"}, {"O","O","O"}};
        rubiksCube[5] = new String[][] {{"R","R","R"}, {"R","R","R"}, {"R","R","R"}};

        for (int face = 0; face < rubiksCube.length; face++){
            System.out.println("Face " + (face + 1) + ":");
            for (int row = 0; row < rubiksCube[face].length; row++){
                for (int col = 0; col < rubiksCube[face][row].length; col++){
                    System.out.print(rubiksCube[face][row][col] + " ");
                }
                System.out.println(); // each row
            }
            System.out.println(); // each face
        }

    }

}
