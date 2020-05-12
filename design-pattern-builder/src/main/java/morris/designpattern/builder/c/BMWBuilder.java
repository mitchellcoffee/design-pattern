package morris.designpattern.builder.c;

import morris.designpattern.builder.c.car.BMWModel;
import morris.designpattern.builder.c.car.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

	private BMWModel bmw = new BMWModel();

	public CarModel getCarModel() {
		return this.bmw;
	}

	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}
}