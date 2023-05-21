import java.util.Arrays;

public class SquareMatrix {
    public static void main(String[] args) {
        // The matrix is sorted row and col wise individually.
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 },
        };

        int target = 50;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        int[] answer = { -1, -1 };

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                answer[0] = row;
                answer[1] = col;
                break;
            }
        }

        return answer;
    }
}
