package stringBuilder_assignment;

public class question2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("It is used to _ at the specified index position");

        sb.replace(14, 15, "insert text");

        System.out.println(sb.toString());

    }
}
