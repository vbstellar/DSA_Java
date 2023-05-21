public class RotatedSortedArray {
    public static void main(String[] args) {
        // 4,5,6,7,1,2,3
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int target = 5;
        System.out.println(search(arr, target));

    }

    static int search(int[] array, int target) {
        int peak = peakFinder(array);
        int answer = binarySearch(array, target, 0, peak);
        if (answer != -1) {
            return answer;
        }
        return binarySearch(array, target, peak + 1, array.length - 1);
    }

    static int peakFinder(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            } else if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            } else if (array[start] >= array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int tar, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > tar) {
                e = mid - 1;
            } else if (tar > arr[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
