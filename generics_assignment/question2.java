package generics_assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class question2 {
    public static void main(String[] args) {

        HashMap<Integer, Double> map = new HashMap<Integer, Double>();

        Random randomNum = new Random();

        for (int i = 0; i < 10; i++) {
            map.put(randomNum.nextInt(), randomNum.nextDouble());
        }

        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());
        }
    }
}