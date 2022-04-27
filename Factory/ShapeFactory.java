package Factory;

public class ShapeFactory {
    void getShape(int shapeType) {
        if (shapeType == 1) {
            return new Circle();
        } else if (shapeType == 2) {
            return new Rectangle();
        } else if (shapeType == 3) {
            return new Square();
        }
    }
}
