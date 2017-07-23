package lv.javaguru.lessons.lesson8.shoppinglist;

import java.util.Scanner;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class ProductAdder implements MenuItem {

    private Basket basket;
    private ProductStorage productStorage;

    public ProductAdder(Basket basket, ProductStorage productStorage) {
        this.basket = basket;
        this.productStorage = productStorage;
    }

    @Override
    public void execute() {
        System.out.print("Enter product name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Product product = productStorage.findProduct(name);
        if (product == null) {
            System.out.println("Product not available");
        } else {
            System.out.println("Product added : " + product);
            basket.add(product);
        }
    }
}
