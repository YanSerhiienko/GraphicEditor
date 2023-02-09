package graphicEditor;

import java.awt.*;
import java.util.Objects;

public class Point extends Shape implements Drawable {
    private static final int NUMBER_OF_VERTICES = 1;
    private double x;
    private double y;

    //////////shape override//////////
    @Override
    protected String getName() {
        return "Point";
    }
    @Override
    public String getNumberOfVertices() {
        return "Number of vertices: " + NUMBER_OF_VERTICES;
    }
    //////////drawable override//////////
    @Override
    public Color getColor() {
        return Color.black;
    }
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
        Point parameter = (Point) o;
        return x == parameter.x &&
                y == parameter.y &&
                getName().equals(((Point) o).getName());
    }
    @Override
    public int hashCode () {
        return Objects.hash(x, y, getName());
    }
}
