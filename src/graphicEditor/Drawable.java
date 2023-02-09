package graphicEditor;

import java.awt.*;

public interface Drawable {
    Color getColor();

    void setX(double x);
    void setY(double y);

    double getX();
    double getY();
}
