package graphicEditor;

public class Quad extends Shape {
    private String name = "Quad";
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
