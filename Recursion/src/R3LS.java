public class R3LS {
    public static void main(String[] args) {
        // Linear Search using recursion
        int[] array = { 2, 3, 6, 389, 18, 9, 93 };
        int target = 93;
        System.out.println(LS(array, target, 0));
    }

    private static int LS(int[] array, int target, int index) {
        if (index > array.length - 1) {
            return -1;
        }
        if (array[index] == target) {
            return index;
        }

        return LS(array, target, index + 1);
    }
}
