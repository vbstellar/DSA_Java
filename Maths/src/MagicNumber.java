public class MagicNumber {
    public static void main(String[] args) {
        // Find the nth magic number in base of 5 for eg: if n = 6 convert 6 in binary
        // then make it
        // Multiply with each bits with increasing power of 5
        // n=3 == 011
        // magic number will be = 5^3*0 + 5^2*1 + 5^1*1

        int n = 6;
        double answer = MagicNo(n);
        System.out.println(answer);
    }

    private static double MagicNo(int n) {
        double answer = 0;
        int power = 1;
        while (n > 0) {
            int bit = n & 1;
            answer = answer + (int) (bit) * Math.pow(5, power);
            power++;
            n >>= 1;
        }
        return answer;

    }
}
