public class Prod1toN {
    public static void main(String[] args) {
        int result = Factorial(5);
        System.out.println(result);
    }

    static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return (n * Factorial(n - 1));
    }
}
