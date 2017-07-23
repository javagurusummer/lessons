package lv.javaguru.lessons.lesson8.shoppinglist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class ProductStorage {

    private List<Product> products;

    public ProductStorage() {
        products = new ArrayList<>();
        try {
            FileReader reader = new FileReader("/Users/olegssedacs/IdeaProjects/summer_sundays/src/lv/javaguru/lessons/lesson8/shoppinglist/products");
            BufferedReader bf = new BufferedReader(reader);
            String line;
            while ((line = bf.readLine()) != null) {
                String[] splitted = line.split(",");
                String name = splitted[0];
                double price = Double.parseDouble(splitted[1]);
                products.add(new Product(name, price));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Product findProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getAll() {
        return products;
    }

}
