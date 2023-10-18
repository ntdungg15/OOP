import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;


    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     distance .
     */
    public double distance(Point newPoint) {
        double xdiff = pointX - newPoint.pointX;
        double ydiff = pointY - newPoint.pointY;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(point.pointX, pointX) == 0
                && Double.compare(point.pointY, pointY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    @Override
    public String toString() {
        return "(" + String.format("%.1f", pointX) + "," + String.format("%.1f", pointY) + ")";
    }
}