package lv.javaguru.lessons.lesson10.shapes;

public class ShapesMain {

    public static void main(String[] args) {
        while (true) {
            try {
                execute();
            } catch (Exception e) {
                e.printStackTrace();
                //do something
            }
        }
    }

    private static void execute() {
        GraficEditor graficEditor = new GraficEditor();
        ConsoleInputProvider inputProvider = new ConsoleInputProvider();
        switch (inputProvider.getInt("1. Rectangular\n2.Triangle\nYour choice : ")) {
            case 1: {
                graficEditor.drawRectangle();
                break;
            }
            case 2:
                graficEditor.drawTriangle();
        }
    }


}
