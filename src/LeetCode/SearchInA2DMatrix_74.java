package LeetCode;

public class SearchInA2DMatrix_74 {

    //    Time: O(log(mn)) | Space: O(1)
    public static boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix.length == 0) return false;

        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = rows * columns;

        while(low < high) {
            int mid = (low+high)/2;

            if(matrix[mid/columns][mid%columns] == target) {
                return true;
            } else if (matrix[mid/columns][mid%columns] < target) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return false;
    }

//    public static boolean searchMatrix(int[][] matrix, int target) {
//        int i = 0, j = matrix[0].length - 1;
//
//        while (i < matrix.length && j >= 0) {
//            if (matrix[i][j] == target) {
//                return true;
//            } else if (matrix[i][j] > target) {
//                j--;
//            } else {
//                i++;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60} };
        boolean result = searchMatrix2(matrix, 3);
        System.out.println(result);
    }
}
