package morris.designpattern.builder.c;

import morris.designpattern.builder.c.car.BenzModel;
import morris.designpattern.builder.c.car.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

	private BenzModel benz = new BenzModel();

	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}

	public CarModel getCarModel() {
		return this.benz;
	}
}
