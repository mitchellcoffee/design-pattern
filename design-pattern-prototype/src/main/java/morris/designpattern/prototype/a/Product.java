package morris.designpattern.prototype.a;

public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
