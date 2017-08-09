package lv.javaguru.lessons.lesson10.shapes;

import java.util.Arrays;

public abstract class Shape {

    private double[] sides;

    public Shape(int sides, double... lengths) {
        this.sides = new double[sides];
        for (int i = 0; i < lengths.length; i++) {
            setSide(i, lengths[i]);
        }
    }

    protected void setSide(int side, double length) {
        if (length <= 0) {
            // we cant set negative length
            // so someone tries to use our class incorrectly
            // we shouldn't ignore it and should throw exception
            // because someone will continue incorrect using
            throw new IllegalArgumentException("length should be positive. Provided " + length);
        }
        sides[side] = length;
    }

    protected double getSide(int side) {
        return sides[side];
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }
}
