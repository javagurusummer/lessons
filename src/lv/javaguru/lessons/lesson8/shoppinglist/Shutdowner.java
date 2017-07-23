package lv.javaguru.lessons.lesson8.shoppinglist;

/**
 * Created by olegssedacs on 23/07/2017.
 */
public class Shutdowner implements MenuItem {

    @Override
    public void execute() {
        System.exit(0);
    }
}
