package morris.designpattern.factory.a.idcard;

import morris.designpattern.factory.a.framework.Factory;
import morris.designpattern.factory.a.framework.Product;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {

    private Map<Integer, String> owners = new HashMap<Integer, String>();

    private int index = 100;

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, index++);
    }

    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard)product;
        owners.put(idCard.getIndex(), idCard.getOwner());
    }

    public Map<Integer, String> getOwners() {
        return owners;
    }
}
