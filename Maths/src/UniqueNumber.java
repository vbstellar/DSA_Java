public class UniqueNumber {
    public static void main(String[] args) {
        // Program to get the only existing unique number in array using bit operator
        int[] array = { 3, 4, 5, 4, 5, 3, 7, 8, 9, 8, 9 };
        System.out.println(ans(array));
    }

    private static int ans(int[] array) {
        int unique = 0;
        for (int num : array) {
            unique ^= num;
        }
        return unique;
    }
}
