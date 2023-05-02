package basic_data_structure_assignment;

import java.util.Arrays;

class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped = true;
        while (n != 0 && isSwapped) {
            isSwapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSwapped = true;
                }
            }
            --n;
        }

        return arr;
    }
}

public class question8 {
    public static void main(String[] args) {
        int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

        BubbleSort obj = new BubbleSort();
        int[] sortedArray = obj.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
