public class App {
    // Tell number is odd or not by using bit operator
    public static void main(String[] args) throws Exception {
        int number = 89;
        System.out.println(isOdd(number));
    }

    private static boolean isOdd(int number) {
        return (number & 1) == 1;
    }
}
