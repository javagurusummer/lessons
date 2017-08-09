package lv.javaguru.lessons.lesson10.shapes;

public class Triangle extends Shape {

    public Triangle(double a, double b, double c) {
        super(3, a, b, c);
        validateTriangle(a, b, c);
    }

    public void setA(double a) {
        setSideAndValidate(0, a);
    }

    public void setB(double b) {
        setSideAndValidate(1, b);
    }

    public void setC(double c) {
        setSideAndValidate(2, c);
    }

    private void setSideAndValidate(int side, double length) {
        super.setSide(side, length);
        validateTriangle(getSide(0), getSide(1), getSide(2));
    }

    private void validateTriangle(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalArgumentException(String.format("Triangle not exist %f %f %f", a, b, c));
        }
    }
}
