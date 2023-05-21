import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 3, 4, 2, 1, 5 };
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
