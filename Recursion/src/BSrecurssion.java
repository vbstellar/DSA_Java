public class BSrecurssion {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        System.out.println(BS(array, target, 0, array.length));
    }

    static int BS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return BS(arr, target, s, mid - 1);
        }
        return BS(arr, target, mid + 1, e);
    }
}
