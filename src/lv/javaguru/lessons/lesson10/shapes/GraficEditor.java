package lv.javaguru.lessons.lesson10.shapes;

public class GraficEditor {

    public void drawRectangle() {
        ConsoleInputProvider inputProvider = new ConsoleInputProvider();
        double a = inputProvider.getDouble("Input side a : ");
        double b = inputProvider.getDouble("Input side b : ");
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println(rectangle);
    }

    public void drawTriangle() {
        ConsoleInputProvider inputProvider = new ConsoleInputProvider();
        double a = inputProvider.getDouble("Input side a : ");
        double b = inputProvider.getDouble("Input side b : ");
        double c = inputProvider.getDouble("Input side c : ");
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle);
    }

    public void resizeRectangle(Rectangle rectangle, double sideA, double sideB) {
        rectangle.setA(sideA);
        rectangle.setB(sideB);
        System.out.println(rectangle);
    }

    public void resizeTriangle(Triangle triangle, double sideA, double sideB, double sideC) {
        triangle.setA(sideA);
        triangle.setB(sideB);
        triangle.setC(sideC);
        System.out.println(triangle);
    }

    public double getDouble(String message) {
        ConsoleInputProvider inputProvider = new ConsoleInputProvider();
        while (true) {
            double side = inputProvider.getDouble(message);
            if (side > 0) {
                return side;
            } else {
                System.out.println("Wrong side");
            }
        }
    }
}
