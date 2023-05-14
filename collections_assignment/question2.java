package collections_assignment;

import java.util.*;

class Product {
    int productId;
    String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductId : " + productId + " ProductName : " + productName;
    }
}

public class question2 {
    public static void main(String[] args) {

        TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.productId == o2.productId) { // means duplicate products with same productId
                    return 0;
                }
                if (o1.productId > o2.productId) {
                    return 1;
                }
                return -1;
            }
        });

        set.add(new Product(101, "Box"));
        set.add(new Product(102, "Boxes"));

        for (Product p : set) {
            System.out.println(p.toString());
        }

        // (Optional) Using ArrayList for above solution
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(101, "Box"));
        list.add(new Product(101, "Box"));
        list.add(new Product(102, "Boxes"));

        list = removeDuplicates(list);

        System.out.println(list);
    }

    public static ArrayList<Product> removeDuplicates(ArrayList<Product> list) {

        // Create a new LinkedHashSet
        TreeSet<Product> set = new TreeSet<Product>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.productId == o2.productId) {
                    return 0;
                }
                if (o1.productId > o2.productId) {
                    return 1;
                }
                return -1;
            }
        });

        set.addAll(list);
        list.clear();
        list.addAll(set);

        return list;
    }
}
