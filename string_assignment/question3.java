package string_assignment;

public class question3 {
    public static void main(String[] args) {

        String str = "Java String pool refers to collection of Strings which are stored in heap memory";

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        String str2 = str.replace('a', '$');
        System.out.println(str2);

        if (str.contains("collection")) {
            System.out.println("Index: " + str.indexOf("collection"));
        }

        String dummyStr = "java string pool refers to collection of strings which are stored in heap memory";
        if (str.equals(dummyStr)) {
            System.out.println("string matched the original");
        } else {
            System.out.println("string does not match the original");

            // another method to check for equal strings
            if (str.compareTo(dummyStr) == 0) {
                System.out.println("string matched the original");
            }
        }

    }
}
