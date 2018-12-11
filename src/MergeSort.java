import java.io.IOException;

public class MergeSort {
    /**
     * @return
     */
    public static int[] sort() {
        int[] unsorted = {1, 4, 8, 5, 3, 6, 2, 7};
        int[] tmp = new int[unsorted.length];

        mergeSort(unsorted, tmp, 0, unsorted.length - 1);

        return tmp;
    }

    public static void mergeSort(int[] orgnArr, int[] tmpArr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(orgnArr, tmpArr, left, mid);
            mergeSort(orgnArr, tmpArr, mid + 1, right);
            merge(orgnArr, tmpArr, left, mid, right);
        }
    }

    public static void merge(int[] orgnArr, int[] tmpArr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int p = 0;

        while(i <= mid && j <= right) {
            if(orgnArr[i] <= orgnArr[j]) {
                tmpArr[p++] = orgnArr[i++];
            } else {
                tmpArr[p++] = orgnArr[j++];
            }
        }

        while(i <= mid) {//将左边剩余元素填充进temp中
            tmpArr[p++] = orgnArr[i++];
        }
        while(j <= right) {//将右序列剩余元素填充进temp中
            tmpArr[p++] = orgnArr[j++];
        }
    }
}
