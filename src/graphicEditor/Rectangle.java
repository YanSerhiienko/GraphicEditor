package graphicEditor;

public class Rectangle extends Shape {
    private String name = "Rectangle";
    private int numberOfVertices = 4;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumberOfVertices() {
        return "Number of vertices: " + numberOfVertices;
    }

}
