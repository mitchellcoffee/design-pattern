package morris.designpattern.factory.b;

import morris.designpattern.factory.b.factory.ShapeFactory;
import morris.designpattern.factory.b.shape.Shape;

public class ShapeFactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
