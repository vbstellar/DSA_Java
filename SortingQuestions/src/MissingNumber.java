public class MissingNumber {
    // Leetcode 268 Missing Number asked in AMAZON
    public static void main(String[] args) throws Exception {
        int[] array = { 0, 2, 3, 1 };
        int answer = missingNumber(array);
        System.out.println(answer);
    }

    static int missingNumber(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    static void sort(int[] array) {
        int start = 0;
        while (start < array.length) {
            int correctIndex = array[start];
            if (correctIndex < array.length && array[start] != array[correctIndex]) {
                swap(array, start, correctIndex);
            } else {
                start++;
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
