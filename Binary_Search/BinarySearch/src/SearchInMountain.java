public class SearchInMountain {
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 7, 8, 9, 5, 3, 1 };
        int target = 3;
        int answer = search(array, target);
        System.out.println(answer);
    }

    static int search(int[] array, int target) {
        int peak = FindPeak(array);

        int answer = binarySearch(array, target, 0, peak);
        if (answer == -1) {
            answer = descendingBinarySearch(array, target, peak, array.length - 1);
        }
        return answer;
    }

    static int FindPeak(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // here end and start becomes same
        return end;
    }

    static int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int descendingBinarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                start = mid + 1;
            } else if (target > array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
