package lv.javaguru.lessons.lesson7;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class CatMain {

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        barsik.setName("       ");
        barsik.setName(null);

        Cat thomas = new Cat("Thomas");
        barsik.speak();
        thomas.speak();

    }

}
