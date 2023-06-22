package Week2_2206_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + name + " price: " + price;
    }
}

public class Bai5 {
    HashMap<String, List<Product>> listProduct = new HashMap<>();

    public void put(Product product) {
        if (listProduct.containsKey(product.name)) {
            for (Map.Entry<String, List<Product>> element : listProduct.entrySet()) {
                if (element.getKey().equals(product.name)) {
                    element.getValue().add(product);
                }
            }
        } else {
            listProduct.put(product.name, new ArrayList<>(List.of(product)));
        }
    }

    public List<Product> get(String name) {
        List<Product> res = new ArrayList<>();
        if (listProduct.containsKey(name)) {
            for (Map.Entry<String, List<Product>> element : listProduct.entrySet()) {
                if (element.getKey().equals(name)) {
                    int size = element.getValue().size();
                    for (int i = 0; i < size; i++) {
                        res.add(element.getValue().get(i));
                    }
                }
            }
        }
        return res;
    }

    public boolean remove(String name) {
        boolean res = false;
        if (listProduct.containsKey(name)) {
            listProduct.remove(name);
            res = true;
        } else {
            res = false;
        }
        return res;

    }

    public double totalPriceOf(String name) {
        double total = 0;
        if (listProduct.containsKey(name)) {
            for (Map.Entry<String, List<Product>> element : listProduct.entrySet()) {
                if (element.getKey().equals(name)) {
                    int size = element.getValue().size();
                    for (int i = 0; i < size; i++) {
                        total += element.getValue().get(i).price;
                    }
                }
            }
        } else {
            total = 0;
        }

        return total;
    }

    public int countTotal(String name) {
        int count = 0;
        if (listProduct.containsKey(name)) {
            for (Map.Entry<String, List<Product>> element : listProduct.entrySet()) {
                if (element.getKey().equals(name)) {
                    int size = element.getValue().size();
                    for (int i = 0; i < size; i++) {
                        count++;
                    }
                }
            }
        } else {
            count = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        Product p1 = new Product("laptop", 1.0);
        Product p2 = new Product("laptop", 1.0);
        Product p3 = new Product("pc", 123451.0);
        Bai5 b5 = new Bai5();
        b5.put(p1);
        b5.put(p2);
        b5.put(p3);
        System.out.println(b5.listProduct);
        System.out.println(b5.get("laptop"));
        // System.out.println(b5.remove("laptop"));
        System.out.println(b5.totalPriceOf("laptop"));
        System.out.println(b5.countTotal("laptop"));
        // System.out.println(b5.listProduct);
    }
}
