import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number for which you want fibonacci sum: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println();
        int answer = FibonacciNum(number);
        System.out.println(answer);
    }

    static int FibonacciNum(int n) {
        if (n < 2) {
            return n;
        }
        return FibonacciNum(n - 1) + FibonacciNum(n - 2);
    }

}
