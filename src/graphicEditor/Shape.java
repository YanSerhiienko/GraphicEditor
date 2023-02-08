package graphicEditor;

import java.util.Objects;

public abstract class Shape {
    protected String shapeType = "2d shape";

    protected abstract String getName();

    public final String getShapeType() {
        return shapeType;
    }

    protected abstract String getNumberOfVertices();

    /*@Override
    public String toString() {
        return "This is " + shapeType + " figure " + name ;
    }*/

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape parameter = (Shape) o;
        return x == parameter.x &&
                y == parameter.y &&
                name.equals(((Shape) o).name);
    }

    @Override
    public int hashCode () {
        return Objects.hash(x, y, name);
    }*/

}
