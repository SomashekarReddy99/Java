package Matrix;
import java.util.ArrayList;
import java.util.List;

public class Saddlepoint {

    public static List<int[]> findSaddlePoints(int[][] matrix) {
        List<int[]> saddlePoints = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return saddlePoints;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find the minimum elements in each row
        for (int i = 0; i < rows; i++) {
            int minInRow = matrix[i][0];
            int minColIndex = 0;
            
            // Find the minimum element in the current row
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    minColIndex = j;
                }
            }
            
            // Check if this minimum element is the maximum in its column
            boolean isSaddlePoint = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][minColIndex] > minInRow) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                saddlePoints.add(new int[]{i, minColIndex});
            }
        }
        // for(int i=0;i<rows;i++)
        // {
        //     int minRow=matrix[i][0];
        //     int colIndex=0;
        //     for(int j=1;j<cols;j++)
        //     {
        //         if(matrix[i][j]<minRow)
        //         {
        //             minRow=matrix[i][j];
        //             colIndex=j;
        //         }
        //     }
        //     boolean Saddle=true;
        //     for(int k=0;k<rows;k++)
        //     {
        //         if(matrix[k][colIndex]>minRow)
        //         {
        //             Saddle=false;
        //         }
        //     }
        //     if(Saddle)
        //     {
        //         saddlePoints.add(new int[]{i,colIndex});
        //     }
        // }
        return saddlePoints;
        }

    public static void main(String[] args) {
        int[][] matrix = {
            {10,5 , 6},
            {5, 3, 2},
            {60, 1, 9}
        };

        List<int[]> saddlePoints = findSaddlePoints(matrix);

        System.out.println("Saddle Points (row, column):");
        for (int[] point : saddlePoints) {
            System.out.println("(" + point[0] + ", " + point[1] + ")");
        }
    }
}
