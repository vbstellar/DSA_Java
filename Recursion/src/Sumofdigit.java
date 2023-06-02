public class Sumofdigit {
    public static void main(String[] args) {
        System.out.println(DigitSum(1347));
    }

    static int DigitSum(int n) {
        if (n == 0) {
            return 0;
        }
        // int lastDigit = n % 10;
        // n = n / 10;
        return (n % 10) + DigitSum(n / 10);
    }
}
