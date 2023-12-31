package asdkjh;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine {
    private double x1; // x-coordinate of first endpoint
    private double y1; // y-coordinate of first endpoint
    private double x2; // x-coordinate of second endpoint
    private double y2; // y-coordinate of second endpoint
    private Color strokeColor; // color of this line

    // constructor with input values
    public MyLine(
            double x1, double y1, double x2, double y2, Color strokeColor) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.strokeColor = strokeColor;
    }

    // draw the line in the specified color
    public void draw(GraphicsContext gc) {
        gc.setStroke(strokeColor);
        gc.strokeLine(x1, y1, x2, y2);
    }
}