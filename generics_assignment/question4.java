package generics_assignment;

import java.util.Date;

class Pair<K, V> {
    K key;
    V value;

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class question4 {
    public static void main(String[] args) {

        // Restriction is provided by passing date type as generics
        Pair<String, String> myObj1 = new Pair<String, String>();
        myObj1.setKey("1");
        myObj1.setValue("Hello");

        Pair<String, Date> myObj2 = new Pair<String, Date>();
        myObj2.setKey("Today is");
        myObj2.setValue(new Date());

    }
}