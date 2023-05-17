package generics_assignment;

public class question3 {

    public static <T> void swap(T[] arr, int idx1, int idx2) {
        T temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        swap(arr, 1, 3);

        for (Integer num : arr) {
            System.out.println(num);
        }

        String[] str = { "aa", "bb", "cc", "dd", "ee" };
        swap(str, 1, 3);

        for (String s : str) {
            System.out.println(s);
        }
    }
}
