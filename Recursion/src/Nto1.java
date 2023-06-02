public class Nto1 {
    public static void main(String[] args) {
        PrintN(5);
    }

    static void PrintN(int n) {
        if (n == 0) {
            // System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintN(n - 1);
    }
}