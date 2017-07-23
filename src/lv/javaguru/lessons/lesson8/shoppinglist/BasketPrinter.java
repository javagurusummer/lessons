package lv.javaguru.lessons.lesson8.shoppinglist;

import java.util.List;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class BasketPrinter implements MenuItem {

    private Basket basket;

    public BasketPrinter(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void execute() {
        List<Product> products = basket.getProducts();
        if (products.isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }
}
