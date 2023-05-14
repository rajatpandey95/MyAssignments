package collections_assignment;

import java.util.Map;
import java.util.TreeMap;

enum Gender {
    Male,
    Female
}

class Contact implements Comparable<Contact> {
    long phoneNumber;
    String name, email;
    Gender gender;

    public Contact(long phoneNumber, String name, String email, Gender gender) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public int compareTo(Contact o) {
        if (o.phoneNumber > phoneNumber) {
            return -1;
        } else if (o.phoneNumber < phoneNumber) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(name);
        sb.append(",  PhoneNumber : ").append(phoneNumber);
        sb.append(",  Email : ").append(email);
        sb.append(",  Gender : ").append(gender);

        return sb.toString();
    }
}

public class question1 {
    public static void main(String[] args) {

        TreeMap<Long, Contact> map = new TreeMap<Long, Contact>();

        map.put((long) 102, new Contact(1234567892, "Rajat", "rajat@gmail.com", Gender.Male));
        map.put((long) 101, new Contact(1234567891, "John Doe", "john@gmail.com", Gender.Male));
        map.put((long) 103, new Contact(1234567893, "Jane Doe", "jane@gmail.com", Gender.Female));
        map.put((long) 104, new Contact(1234567894, "Emma", "emma@gmail.com", Gender.Female));
        map.put((long) 105, new Contact(1234567895, "Ram", "ram@gmail.com", Gender.Male));

        // Fetch all the keys and print them
        for (long key : map.keySet()) {
            System.out.println(key);
        }

        // Fetch all the values and print them
        for (Contact contact : map.values()) {
            System.out.println(contact.toString());
        }

        for (Map.Entry<Long, Contact> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue().toString());
        }
    }
}
