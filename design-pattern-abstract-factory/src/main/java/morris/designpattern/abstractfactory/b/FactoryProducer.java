package morris.designpattern.abstractfactory.b;

import morris.designpattern.abstractfactory.b.factory.AbstractFactory;
import morris.designpattern.abstractfactory.b.factory.ColorFactory;
import morris.designpattern.abstractfactory.b.factory.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }

}
