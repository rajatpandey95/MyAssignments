package lambdaExpression_assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class question7 {
    public static void main(String[] args) {

        // LinkedHashMap to maintain insertion order
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        String str = convertKeyValueToString(map);
        System.out.println(str);
    }

    public static String convertKeyValueToString(HashMap<String, Integer> map) {

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }

        return sb.toString();
    }
}