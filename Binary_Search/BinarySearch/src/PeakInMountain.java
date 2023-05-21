public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 4, 3, 2 };
        int answer = FindPeak(arr);
        System.out.println(answer);
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
        return array[end];
    }
}
