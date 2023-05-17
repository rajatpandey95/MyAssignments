package lambdaExpression_assignment;

import java.util.*;
import java.util.function.Consumer;

public class question5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        String firstLetters = processWords(list);
        System.out.println(firstLetters);
    }

    public static String processWords(List<String> wordsList) {
        StringBuilder sb = new StringBuilder();
        Consumer<List<String>> editList = list -> {
            for (String word : list) {
                sb.append(word.charAt(0));
            }
        };
        editList.accept(wordsList);

        return sb.toString();
    }
}