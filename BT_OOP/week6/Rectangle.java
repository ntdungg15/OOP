import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     Rectangle .
     */
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
        this.topLeft = new Point(0.0, 0.0);
    }

    /**
     Rectangle .
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.topLeft = new Point(0.0, 0.0);
    }

    /**
     Rectangle .
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.topLeft = new Point(0.0, 0.0);
        setColor(color);
        setFilled(filled);
    }

    /**
     Rectangle .
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ",width="
                + String.format("%.1f", width) + ",length=" + String.format("%.1f", length)
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
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0
                && Double.compare(rectangle.length, length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }
}