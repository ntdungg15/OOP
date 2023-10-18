import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * removeDuplicates .
     */
    public void removeDuplicates() {
        List<Shape> uniqueShapes = new ArrayList<>();

        for (Shape shape : shapes) {
            if (!uniqueShapes.contains(shape)) {
                uniqueShapes.add(shape);
            }
        }

        shapes = uniqueShapes;
    }

    /**
     getInfo .
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape.toString()).append("\n");
        }
        return info.toString();
    }
}
