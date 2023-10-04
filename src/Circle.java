public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14159;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getPI() {
        return PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }

}
