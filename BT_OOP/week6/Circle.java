import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    public Circle() {
        this.center = new Point(0.0, 0.0);
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.center = new Point(0.0, 0.0);
        this.radius = radius;
    }

    /**
     * Circle .
     */
    public Circle(double radius, String color, boolean filled) {
        this.center = new Point(0.0, 0.0);
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Circle .
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        this.center = center;
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ",radius=" + String.format("%.1f", radius)
                + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0
                && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}