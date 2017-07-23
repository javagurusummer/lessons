package lv.javaguru.lessons.lesson8.shoppinglist;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class AvailableProductPrinter implements MenuItem {

    private ProductStorage productStorage;

    public AvailableProductPrinter(ProductStorage productStorage) {
        this.productStorage = productStorage;
    }

    @Override
    public void execute() {
        System.out.println("All available products");
        for (Product p : productStorage.getAll()) {
            System.out.println(p);
        }
    }
}
