package graphicEditor;

public class Main {
    public static void main(String[] args) {
        Shape quad = new Quad();
        System.out.println(quad.getName());
        System.out.println(quad.getShapeType());
        System.out.println(quad.getNumberOfVertices());

        Shape circle = new Circle();
        System.out.println(circle.getName());
        System.out.println(circle.getShapeType());
        System.out.println(circle.getNumberOfVertices());
    }
}
