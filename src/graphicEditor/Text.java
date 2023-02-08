package graphicEditor;

import java.awt.*;
import java.util.Objects;

public class Text extends Shape implements Drawable, Colorable, Scalable {
    private static final int numberOfVertices = 4;
    private double x;
    private double y;

    //////////shape override//////////
    @Override
    protected String getName() {
        return "Text";
    }
    @Override
    public String getNumberOfVertices() {
        return "Number of vertices: " + numberOfVertices;
    }
    //////////colorable override//////////
    @Override
    public Color getColor() {
        return null;
    }
    //////////scalable override//////////
    @Override
    public double getScale() {
        return 0;
    }
    //////////drawable override//////////
    @Override
    public void setX(double x) {
        this.x = x;
    }
    @Override
    public void setY(double y) {
        this.y = y;
    }
    @Override
    public double getX() {
        return x;
    }
    @Override
    public double getY() {
        return y;
    }
    //////////string, equals, hash//////////
    @Override
    public String toString() {
        return "This is " + shapeType + " figure " + getName();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text parameter = (Text) o;
        return x == parameter.x &&
                y == parameter.y &&
                getName().equals(((Text) o).getName());
    }
    @Override
    public int hashCode () {
        return Objects.hash(x, y, getName());
    }
}
