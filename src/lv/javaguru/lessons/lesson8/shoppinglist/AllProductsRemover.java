package lv.javaguru.lessons.lesson8.shoppinglist;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class AllProductsRemover implements MenuItem {

    private Basket basket;

    public AllProductsRemover(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void execute() {
        basket.removeAll();
        System.out.println("Basket is empty");
    }
}
