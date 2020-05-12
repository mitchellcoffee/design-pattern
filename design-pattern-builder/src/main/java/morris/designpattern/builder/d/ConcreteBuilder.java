package morris.designpattern.builder.d;

public class ConcreteBuilder extends Builder {

	private Product product = new Product();

	public void setPart() {

	}

	public Product buildProduct() {
		return product;
	}
}
