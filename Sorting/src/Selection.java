import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        // SELECTION SORT
        int[] array = { 3, 4, 1, 5, 2 };
        SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length - 1 - i;
            int maxValueIndex = findMax(array, 0, lastIndex);
            swap(array, maxValueIndex, lastIndex);
        }
    }

    private static int findMax(int[] array, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
