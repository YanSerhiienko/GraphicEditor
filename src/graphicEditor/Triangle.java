package graphicEditor;

public class Triangle extends Shape{
    private String name = "Triangle";
    private int numberOfVertices = 3;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumberOfVertices() {
        return "Number of vertices: " + numberOfVertices;
    }
}
