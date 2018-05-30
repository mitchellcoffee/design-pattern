package morris.designpattern.factory.b;

import morris.designpattern.factory.b.factory.GenericShapeFactory;
import morris.designpattern.factory.b.shape.Rectangle;
import morris.designpattern.factory.b.shape.Shape;

public class GenericShapeFactoryDemo {

    public static void main(String[] args) {
        GenericShapeFactory factory = new GenericShapeFactory();
        Shape rectangle = factory.getClass(Rectangle.class);
        rectangle.draw();
    }
}
