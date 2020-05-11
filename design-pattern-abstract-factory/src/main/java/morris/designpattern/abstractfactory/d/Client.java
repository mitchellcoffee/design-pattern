package morris.designpattern.abstractfactory.d;

import morris.designpattern.abstractfactory.d.product.AbstractProductA;
import morris.designpattern.abstractfactory.d.product.AbstractProductB;

public class Client {

	public static void main(String[] args) {
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();

		AbstractProductA a1 = creator1.createProductA();
		AbstractProductA a2 = creator2.createProductA();
		AbstractProductB b1 = creator1.createProductB();
		AbstractProductB b2 = creator2.createProductB();
	}
}
