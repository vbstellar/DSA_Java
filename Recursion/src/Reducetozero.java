public class Reducetozero {
    public static void main(String[] args) {
        int result = steps(8, 0);
        System.out.println(result);
    }

    static int steps(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            return steps(n / 2, count + 1);
        } else {
            return steps(n - 1, count + 1);
        }
    }
}
