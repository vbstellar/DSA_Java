import java.util.Arrays;

public class SortedMatrix2 {
    public static void main(String[] args) {
        // The matrix is sorted completely.
        // In this search method we use the logic that if we take the matrix as array
        // sorted form then find the
        // value of normal index in row and col form, for example take 15 it as array
        // index of 14 but in {3,2}
        // in matrix form, so {14/4,14%4}=={3,2} where we divide it by 4 which is the n
        // in n*n.
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        int target = 1;
        int target2 = 16;
        int target3 = 11;

        System.out.println(Arrays.toString(search(matrix, target)));
        System.out.println(Arrays.toString(search(matrix, target2)));
        System.out.println(Arrays.toString(search(matrix, target3)));
    }

    static int[] search(int[][] mat, int target) {
        int row = mat.length;
        int col = mat[0].length;

        int start = 0;
        int end = row * col;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mat[mid / col][mid % col] == target) {
                return new int[] { mid / col, mid % col };
            } else if (mat[mid / col][mid % col] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
