public class oneToN {
    public static void main(String[] args) {
        PrintN(5);
    }

    static void PrintN(int n) {
        if (n == 0) {
            return;
        }
        PrintN(n - 1);
        System.out.println(n);
    }
}
