package lv.javaguru.lessons.lesson7.duck;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class Duck {

    public static boolean killAll;

    public boolean alive;
    public String name;

    public void swim() {
        System.out.println(name + " : swimming");
    }

    public void fly() {
        if (alive && !killAll) {
            System.out.println(name + " :  flying");
        } else {
            System.out.println(name + " : Achtung! Im dead!");
        }
    }

}
