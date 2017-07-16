package lv.javaguru.lessons.lesson7;

/**
 * Created by olegssedacs on 16/07/2017.
 */
public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " : Myau");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

}
