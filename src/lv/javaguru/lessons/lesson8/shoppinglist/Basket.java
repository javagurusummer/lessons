package lv.javaguru.lessons.lesson8.shoppinglist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class Basket {

    private List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(product)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            products.remove(index);
        }
    }

    public void removeAll() {
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }
}
