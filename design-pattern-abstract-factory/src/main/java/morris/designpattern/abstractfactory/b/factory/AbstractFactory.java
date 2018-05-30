package morris.designpattern.abstractfactory.b.factory;

import morris.designpattern.abstractfactory.b.color.Color;
import morris.designpattern.abstractfactory.b.shape.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
