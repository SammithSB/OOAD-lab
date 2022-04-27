package Factory;

import java.util.Random;

public class ShapeClient {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(1);
        shape.draw();
        shape = shapeFactory.getShape(2);
        shape.draw();
        shape = shapeFactory.getShape(3);
        shape.draw();
    }
}
