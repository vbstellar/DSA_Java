public class R4BubbleSort {
    public static void main(String[] args) {
        int[] array = { 4, 5, 2, 1, 3 };
        bubbleSort(array, array.length - 1, 0);
        System.out.println(java.util.Arrays.toString(array));
    }

    private static void bubbleSort(int[] array, int j, int i) {
        if (j == 0) {
            return;
        }
        if (i < j) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            bubbleSort(array, j, i + 1);
        } else {
            bubbleSort(array, j - 1, 0);
        }
    }
}
