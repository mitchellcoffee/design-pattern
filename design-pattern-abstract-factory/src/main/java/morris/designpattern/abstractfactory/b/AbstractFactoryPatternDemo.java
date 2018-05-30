package morris.designpattern.abstractfactory.b;

import morris.designpattern.abstractfactory.b.color.Color;
import morris.designpattern.abstractfactory.b.factory.AbstractFactory;
import morris.designpattern.abstractfactory.b.shape.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("RED");
        color.fill();
    }

}
