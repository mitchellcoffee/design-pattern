package morris.designpattern.abstractfactory.d;

import morris.designpattern.abstractfactory.d.product.AbstractProductA;
import morris.designpattern.abstractfactory.d.product.AbstractProductB;

public abstract class AbstractCreator {

	public abstract AbstractProductA createProductA();

	public abstract AbstractProductB createProductB();
}
