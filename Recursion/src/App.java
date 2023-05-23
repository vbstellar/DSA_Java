public class App {
    public static void main(String[] args) throws Exception {
        // Number example 1
        printnum(1);
    }

    static void printnum(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        printnum(n + 1);
    }
}
