public class R4SelectionSort {
    public static void main(String[] args) {
        int[] array = { 4, 5, 2, 1, 3 };
        selectionSort(array, 0, array.length - 1);
        System.out.println(java.util.Arrays.toString(array));
    }

    static void selectionSort(int[] arr, int start, int last) {
        if (start == last) {
            return;
        }
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
        selectionSort(arr, start, last - 1);

    }
}
