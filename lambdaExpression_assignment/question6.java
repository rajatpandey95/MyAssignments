package lambdaExpression_assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class question6 {
    public static void main(String[] args) {

        List<String> wordList = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        List<String> newWordList = convertToUpperCase(wordList);
        System.out.println(newWordList);
    }

    public static List<String> convertToUpperCase(List<String> list) {

        UnaryOperator<List<String>> convertCase = wordList -> {
            for (int i = 0; i < wordList.size(); i++) {
                wordList.set(i, wordList.get(i).toUpperCase());
            }
            return wordList;
        };

        return convertCase.apply(list);
    }
}