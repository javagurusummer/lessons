package lv.javaguru.lessons.lesson8.shoppinglist;

import java.util.Scanner;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class ProductRemover implements MenuItem {

    private Basket basket;

    public ProductRemover(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to remove : ");
        String name = scanner.nextLine();
        Product product = new Product(name, 0);
        basket.remove(product);
    }
}
