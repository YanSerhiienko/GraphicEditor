package graphicEditor;

import java.util.Objects;

public abstract class Shape {
    protected String shapeType = "2d shape";

    protected abstract String getName();

    public final String getShapeType() {
        return shapeType;
    }

    protected abstract String getNumberOfVertices();

}
