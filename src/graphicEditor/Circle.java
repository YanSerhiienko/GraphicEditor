package graphicEditor;

public class Circle extends Shape{
    private String name = "Circle";
    private int numberOfVertices = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumberOfVertices() {
        return "Number of vertices: " + numberOfVertices;
    }
}
