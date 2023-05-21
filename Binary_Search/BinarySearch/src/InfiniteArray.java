public class InfiniteArray {
    public static void main(String[] args) {
        int[] array = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 160;
        int ans = search(array, target);
        System.out.println(ans);
    }

    static int search(int[] array, int target) {
        int start = 0;
        int end = 1;
        while (target > array[end] && end < array.length) {
            start = end;
            end = end * 2;
        }
        return binarySearch(array, target, start, end);
    }

    static int binarySearch(int[] array, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > array[mid]) {
                s = mid + 1;
            } else if (target < array[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}