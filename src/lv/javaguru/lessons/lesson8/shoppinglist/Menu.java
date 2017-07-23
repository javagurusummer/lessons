package lv.javaguru.lessons.lesson8.shoppinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class Menu {

    List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
        Basket basket = new Basket();
        ProductStorage productStorage = new ProductStorage();
        menuItems.add(new BasketPrinter(basket));
        menuItems.add(new ProductAdder(basket, productStorage));
        menuItems.add(new ProductRemover(basket));
        menuItems.add(new AllProductsRemover(basket));
        menuItems.add(new AvailableProductPrinter(productStorage));
        menuItems.add(new Shutdowner());
    }

    public void start() {
        while (true) {
            printMenu();
            int choice = getUserChoice();
            if (choice < 1 || choice > menuItems.size()) {
                continue;
            }
            MenuItem menuItem = menuItems.get(choice - 1);
            menuItem.execute();
        }
    }

    private int getUserChoice() {
        System.out.print("Enter menu item number : ");
        return new Scanner(System.in).nextInt();
    }

    private void printMenu() {
        System.out.println("1. Print basket");
        System.out.println("2. Add product");
        System.out.println("3. Remove product");
        System.out.println("4. Remove all products");
        System.out.println("5. Print all available products");
        System.out.println("6. Exit");
    }
}
