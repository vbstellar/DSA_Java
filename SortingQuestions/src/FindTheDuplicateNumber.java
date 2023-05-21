public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        // Leetcode287 asked in amazon
        int[] arr = { 1, 3, 4, 2, 2 };
        int answer = findDuplicate(arr);
        System.out.println(answer);
    }

    private static int findDuplicate(int[] arr) {
        int start = 0;
        while(start<arr.length){
            if(arr[start]!=start+1){
                int correctIndex = arr[start]-1;
                if(arr[correctIndex]!=arr[start]){
                    swap(arr, start, correctIndex);
                }else{
                    return arr[start];
                }
            }else{
                start++;
            }
            

        }
        return 0;
    } 

    static void swap(int[] array, int a, int b){
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

}
