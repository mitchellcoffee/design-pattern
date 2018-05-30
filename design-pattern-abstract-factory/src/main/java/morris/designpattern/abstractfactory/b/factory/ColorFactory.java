package morris.designpattern.abstractfactory.b.factory;

import morris.designpattern.abstractfactory.b.color.Blue;
import morris.designpattern.abstractfactory.b.color.Color;
import morris.designpattern.abstractfactory.b.color.Red;
import morris.designpattern.abstractfactory.b.shape.Shape;

public class ColorFactory extends AbstractFactory {
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String shape) {
        return null;
    }
}
