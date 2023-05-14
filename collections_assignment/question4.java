package collections_assignment;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class question4 {

    private static boolean checkLeapYear(int year) {
        if (year % 400 == 0)
            return true;

        if (year % 100 == 0)
            return false;

        if (year % 4 == 0)
            return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Date> linkedList = new LinkedList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);

        try {
            linkedList.add(sdf.parse("23-12-2000"));
            linkedList.add(sdf.parse("23-12-2001"));
            linkedList.add(sdf.parse("23-12-1996"));
            linkedList.add(sdf.parse("23-12-2003"));
            linkedList.add(sdf.parse("23-12-2004"));
            linkedList.add(sdf.parse("23-12-2005"));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        int len = linkedList.size();
        for (int i = len - 1; i >= 0; i--) {
            Date date = linkedList.get(i);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int year = calendar.get(Calendar.YEAR);

            if (checkLeapYear(year)) {
                System.out.println("Your date of birth is " + sdf.format(date) + " and it was a leap year");
            } else {
                System.out.println("Your date of birth is " + sdf.format(date) + " and it was not a leap year");
            }
        }
    }
}