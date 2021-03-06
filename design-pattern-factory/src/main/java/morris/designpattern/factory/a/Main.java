package morris.designpattern.factory.a;

import morris.designpattern.factory.a.framework.Factory;
import morris.designpattern.factory.a.framework.Product;
import morris.designpattern.factory.a.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory f = new IDCardFactory();
        Product p1 = f.create("小明");
        Product p2 = f.create("小红");
        p1.use();
        p2.use();
    }

}
