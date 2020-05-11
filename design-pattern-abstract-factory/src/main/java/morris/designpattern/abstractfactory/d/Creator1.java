package morris.designpattern.abstractfactory.d;

import morris.designpattern.abstractfactory.d.product.*;

public class Creator1 extends AbstractCreator {
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}
