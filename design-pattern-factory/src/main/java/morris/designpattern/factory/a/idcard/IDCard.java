package morris.designpattern.factory.a.idcard;

import morris.designpattern.factory.a.framework.Product;

public class IDCard extends Product {

    private String owner;

    private int index;

    public String getOwner() {
        return owner;
    }

    public int getIndex() {
        return index;
    }

    IDCard(String owner, int index) {
        System.out.println("制作 " + owner + "(" + index + ")" + " 的ID卡");
        this.owner = owner;
        this.index = index;
    }

    public void use() {
        System.out.println("使用 " + owner + "(" + index + ")"  + " 的ID卡");
    }
}
