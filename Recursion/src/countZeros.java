public class countZeros {
    public static void main(String[] args) {
        int result = CountZero(204043006, 0);
        System.out.println(result);
    }

    static int CountZero(int n, int count) {
        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) {
            return CountZero(n / 10, count + 1);
        } else {
            return CountZero(n / 10, count);
        }
    }
}
