package streams_assignment;

import java.util.*;
import java.util.function.Consumer;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name=" + name +
                ", city=" + city +
                '}';
    }
}

public class question3 {

    public static List<String> printUniqueCities(List<Trader> traders) {
        List<String> cities = new ArrayList<>();

        Consumer<Trader> findUniqueCities = trader -> {
            String city = trader.getCity();
            if (!cities.contains(city)) {
                cities.add(city);
            }
        };

        traders.stream().forEach(findUniqueCities);
        return cities;
    }

    //
    public static List<String> tradersFromPuneSortByName(List<Trader> traders) {
        List<String> traderNames = new ArrayList<>();

        Consumer<Trader> traderFromPune = trader -> {
            if (trader.getCity().toLowerCase().equals("pune")) {
                traderNames.add(trader.getName());
            }
        };

        traders.stream().forEach(traderFromPune);

        Collections.sort(traderNames);
        return traderNames;
    }

    public static String allTrader3Names(List<Trader> traders) {
        List<String> traderNames = new ArrayList<>();

        Consumer<Trader> findAllTradersNames = trader -> {
            traderNames.add(trader.getName());
        };

        traders.stream().sorted((t1, t2) -> {
            return t1.getName().compareTo(t2.getName());
        }).forEach(findAllTradersNames);

        StringBuilder sb = new StringBuilder();
        for (String name : traderNames) {
            sb.append(name);
        }
        return sb.toString();
    }

    public static ArrayList<Trader> areAnyTradersFromIndore(ArrayList<Trader> traders) {
        ArrayList<Trader> tradersFomIndore = new ArrayList<>();

        Consumer<Trader> traderFromIndore = trader -> {
            if (trader.getCity().toLowerCase().equals("indore")) {
                tradersFomIndore.add(trader);
            }
        };

        traders.stream().forEach(traderFromIndore);

        return tradersFomIndore;
    }

    public static void main(String[] args) {

        ArrayList<Trader> traders = new ArrayList<>();
        traders.add(new Trader("Ram", "Indore"));
        traders.add(new Trader("Shyam", "Pune"));
        traders.add(new Trader("Rakesh", "Indore"));
        traders.add(new Trader("John", "Pune"));
        traders.add(new Trader("Jane", "Mumbai"));

        // What are all the unique cities where the traders work?
        List<String> uniqueCities = printUniqueCities(traders);
        System.out.println("Unique Cities : " + uniqueCities);

        // Find all traders from Pune and sort them by name
        List<String> tradersNames = tradersFromPuneSortByName(traders);
        System.out.println("Traders Names from Pune : " + tradersNames);

        // Return a string of all traders’ names sorted alphabetically.
        String name = allTrader3Names(traders);
        System.out.println("Traders Names : " + name);

        // Are any traders based in Indore
        ArrayList<Trader> tradersFomIndore = areAnyTradersFromIndore(traders);
        System.out.println("Traders from Indore : " + tradersFomIndore);
    }

}
