package stringBuffer_assignment;

public class question2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("It is used to _ at the specified index position");

        sb.replace(14, 15, "insert text");

        System.out.println(sb.toString());
    }
}