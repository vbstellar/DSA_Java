public class ReverseNumber {
    public static void main(String[] args) {
        int result = Reverse(1324);
        System.out.println(result);
    }

    private static int Reverse(int n) {
        if (n == 0) {
            return 0;
        }
        int base = (int) Math.pow(10, lengthDigit(n));
        return (base * (n % 10)) + Reverse(n / 10);
    }

    static int lengthDigit(int n) {
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        return c - 1;
    }
}
