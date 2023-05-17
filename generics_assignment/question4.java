package generics_assignment;

import java.util.Date;

class Pair<T> {
    String key;
    T value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class question4 {
    public static void main(String[] args) {

        // Restriction is provided by passing date type as generics
        Pair<String> myObj1 = new Pair<String>();
        myObj1.setKey("1");
        myObj1.setValue("Hello");

        Pair<Date> myObj2 = new Pair<Date>();
        myObj2.setKey("Today is");
        myObj2.setValue(new Date());

    }
}