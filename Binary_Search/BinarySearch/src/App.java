public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 2, 4, 5, 11, 19, 39 };
        int target = 3;
        int floor = floor(array, target);
        int ceil = ceil(array, target);
        System.out.println("The floor of the target value is " + floor);
        System.out.println("The ceil of the target value is " + ceil);
    }

    static int floor(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (t == arr[mid]) {
                return arr[mid];
            } else if (t > arr[mid]) {
                start = mid + 1;
            } else if (t < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[end];
    }

    static int ceil(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (t == arr[mid]) {
                return arr[mid];
            } else if (t > arr[mid]) {
                start = mid + 1;
            } else if (t < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
