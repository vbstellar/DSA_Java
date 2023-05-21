import java.util.Arrays;

public class InserstionSort {
    public static void main(String[] args) {
        int[] array = { 3, 4, 2, 5, 1 };
        InserstionSorting(array);
        System.out.println(Arrays.toString(array));
    }

    static void InserstionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
