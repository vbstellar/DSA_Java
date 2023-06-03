public class R3SortedOrNot {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 6, 7 };
        System.out.println(isSorted(array, 0));
    }

    static boolean isSorted(int[] arr, int indes) {
        if (indes == arr.length - 1) {
            return true;
        }
        return arr[indes] <= arr[indes + 1] && isSorted(arr, indes + 1);
    }
}
