package morris.designpattern.abstractfactory.b.factory;

import morris.designpattern.abstractfactory.b.color.Color;
import morris.designpattern.abstractfactory.b.shape.Circle;
import morris.designpattern.abstractfactory.b.shape.Shape;
import morris.designpattern.abstractfactory.b.shape.Square;

public class ShapeFactory extends AbstractFactory {

    public Color getColor(String color) {
        return null;
    }


    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
