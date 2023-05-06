package work7_01;

public class Circle extends Shape {
    private double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public void resize(double scale) {
        this.r *= scale;
    }

    public void rotate(double angle) {
        // TODO: реализовать поворот круга на заданный угол
    }
}
