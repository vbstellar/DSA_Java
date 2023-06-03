public class R4pattern1 {
    public static void main(String[] args) {
        pattern(5);
        patternMethod2(5, 0);
    }
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    public static void pattern(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern(n - 1);
    }

    public static void patternMethod2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            patternMethod2(row, col + 1);
        } else {
            System.out.println();
            patternMethod2(row - 1, 0);
        }
    }
}