package morris.designpattern.abstractfactory.d;

import morris.designpattern.abstractfactory.d.product.AbstractProductA;
import morris.designpattern.abstractfactory.d.product.AbstractProductB;
import morris.designpattern.abstractfactory.d.product.ProductA2;
import morris.designpattern.abstractfactory.d.product.ProductB2;

public class Creator2 extends AbstractCreator {
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	public AbstractProductB createProductB() {
		return new ProductB2();
	}
}
