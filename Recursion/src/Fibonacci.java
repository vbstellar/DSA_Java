import java.util.Scanner;

public class Fibonacci {
    // This is a recursive algo for fibonacci problem
    public static void main(String[] args) {
        System.out.print("Enter the number for which you want fibonacci sum: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println();
        System.out.println(fiboFormula(number));
    }

    static long fiboFormula(int n) {
        return (long) (Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5));
    }

    static int FibonacciNum(int n) {
        if (n < 2) {
            return n;
        }
        return FibonacciNum(n - 1) + FibonacciNum(n - 2);
    }

}
