package lv.javaguru.lessons.lesson10.shapes;

public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(2, a, b);
    }

    public double getA() {
        return getSide(0);
    }

    public void setA(double a) {
        setSide(0, a);
    }

    public double getB() {
        return getSide(1);
    }

    public void setB(double b) {
        setSide(1, b);
    }


}
