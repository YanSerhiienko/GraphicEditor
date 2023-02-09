package graphicEditor;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeNamePrinter printer = new ShapeNamePrinter();
        printer.printShapeName(circle);
    }
}


