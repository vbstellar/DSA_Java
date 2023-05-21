import java.util.Arrays;

public class StartAndEnd {
    public static void main(String[] args) throws Exception {
        int[] array = { 2, 4, 7, 7, 7, 7, 7, 8 };
        int target = 7;
        int[] ans = StartEnd(array, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] StartEnd(int[] array, int target) {
        int[] answer = { -1, -1 };

        int startIndex = Search(array, target, true);
        int endIndex = Search(array, target, false);

        answer[0] = startIndex;
        answer[1] = endIndex;

        return answer;
    }

    static int Search(int[] array, int target, boolean isStartIndex) {
        int ans = -1;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
