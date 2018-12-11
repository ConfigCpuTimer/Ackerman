public class BinarySearch {
    public static int binarySearch(int[] arr, int x, int begin, int end) {
        int left = begin;
        int right = end;

        int mid = (left + right) / 2;

        if(begin > end) {
            return -1;
        } else if(x == arr[mid]) {
            return mid;
        } else if(x < arr[mid]) {
            return binarySearch(arr, x, left, mid);
        } else {
            return binarySearch(arr, x, mid + 1, right);
        }
    }
}
