package basic_data_structure_assignment;

class SearchArray {
    public boolean searchArray(int[] arr, int toCheckValue) {
        int len = arr.length;
        for (int value : arr) {
            if (value == toCheckValue) {
                return true;
            }
        }
        return false;
    }
}

public class question7 {
    public static void main(String[] args) {

        SearchArray obj = new SearchArray();

        int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
        int valueToCheck = 19;

        boolean result = obj.searchArray(arr, valueToCheck);

        if (result) {
            System.out.println("Element is present");
        } else {
            System.out.println("Not Present");
        }
    }
}
