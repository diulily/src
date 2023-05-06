package work7_01;

import work7_01.Shape;

public class Square extends Shape {
    private double size;

    public Square(double x, double y, double size) {
        super(x, y);
        this.size = size;
    }

    public void resize(double scale) {
        this.size *= scale;
    }

    public void rotate(double angle) {
        // TODO: реализовать поворот квадрата на заданный угол
    }
}
