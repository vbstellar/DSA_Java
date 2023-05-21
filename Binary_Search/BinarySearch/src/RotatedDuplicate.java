public class RotatedDuplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 9, 2, 2, 2 };
        System.out.println(Pivot(arr));
    }

    static int Pivot(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid + 1]) {
                return mid;
            } else if (array[mid] < array[mid - 1]) {
                return mid - 1;
            } else if (array[mid] == array[start] && array[mid] == array[end]) {
                if (array[start] > array[start + 1]) {
                    return start;
                }
                start++;
                if (array[end] < array[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (array[start] < array[mid] || (array[start] == array[mid] && array[mid] > array[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
