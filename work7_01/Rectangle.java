package work7_01;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void resize(double scale) {
        this.width *= scale;
        this.height *= scale;
    }

    public void rotate(double angle) {
        // TODO: реализовать поворот прямоугольника на заданный угол
    }
}
