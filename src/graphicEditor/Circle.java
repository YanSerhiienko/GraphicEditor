package graphicEditor;

import java.awt.*;
import java.util.Objects;

public class Circle extends Shape implements Drawable, Colorable, Borderable, Scalable {
    private static final int numberOfVertices = 0;
    private double x;
    private double y;

    //////////shape override//////////
    @Override
    protected String getName() {
        return "Circle";
    }
    @Override
    public String getNumberOfVertices() {
        return "Number of vertices: " + numberOfVertices;
    }
    //////////borderable override//////////
    @Override
    public double getBorderWidth() {
        return 0;
    }
    @Override
    public Color getBorderColor() {
        return null;
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
        Circle parameter = (Circle) o;
        return x == parameter.x &&
                y == parameter.y &&
                getName().equals(((Circle) o).getName());
    }
    @Override
    public int hashCode () {
        return Objects.hash(x, y, getName());
    }
}
