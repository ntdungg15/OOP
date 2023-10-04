public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override

    public double getArea() {
        double bottom = super.getArea();
        double xq = 2 * PI * getRadius() * height;
        return 2 * xq + bottom;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }

}
