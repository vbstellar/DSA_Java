import java.util.Arrays;

public class App {
    // Bubble sorting
    public static void main(String[] args) throws Exception {
        int[] array = { 3, 4, 1, 5, 2 };
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void BubbleSort(int[] arr) {
        boolean swapped = false;
        // i pointer which trackes the outer iterations
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    // int temp = arr[j];
                    // arr[j] = arr[j - 1];
                    // arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
