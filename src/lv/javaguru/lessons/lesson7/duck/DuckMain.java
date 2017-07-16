package lv.javaguru.lessons.lesson7.duck;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class DuckMain {

    public static void main(String[] args) {

        Duck.killAll = true;

        Duck donald = new Duck();
        donald.name = "Donald";
        donald.alive = true;

        Duck scrudge = new Duck();
        scrudge.name = "Scrudge";

        donald.swim();
        donald.fly();

        scrudge.swim();
        scrudge.fly();

        Duck noName = new Duck();

        noName.fly();

    }

}
