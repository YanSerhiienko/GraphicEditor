package graphicEditor;

public class Trapeze extends Shape {
    private String name = "Trapeze";
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
