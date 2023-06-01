public class NuberOfDigitInBaseB {
    public static void main(String[] args) {
        // We have to find the number of digits in base b for a number
        // example 6 in decimal has 1 digit but in base 2 it has 3 digits(110)

        int number = 30;
        int base = 16;
        int number_of_digits = (int) (Math.log(number) / Math.log(base));
        System.out.println(number_of_digits + 1);
    }
}
