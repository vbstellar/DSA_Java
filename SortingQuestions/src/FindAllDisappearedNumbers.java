import java.util.ArrayList;
import java.util.List;

//Leetcode 448 asked in google
class FindAllDisappearedNumbers {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 7, 8, 4, 2 };
        List<Integer> answer =  findAllDisappearedNumbers(array);
        System.out.println(answer);
    }

    static List<Integer> findAllDisappearedNumbers(int[] array) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    static void sort(int[] array) {
        int start = 0;
        while (start < array.length) {
            int correctIndex = array[start] - 1;
            if (correctIndex < array.length && array[correctIndex] != array[start]) {
                swap(array, start, correctIndex);
            } else {
                start++;
            }
        }
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}