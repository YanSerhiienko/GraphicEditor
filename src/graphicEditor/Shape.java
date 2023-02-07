package graphicEditor;

public abstract class Shape {
    private String shapeType = "2d shape";

    public abstract String getName();

    public final String getShapeType() {
        return shapeType;
    }

    public abstract String getNumberOfVertices();




}
