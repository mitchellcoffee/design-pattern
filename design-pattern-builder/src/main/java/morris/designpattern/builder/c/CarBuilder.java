package morris.designpattern.builder.c;

import morris.designpattern.builder.c.car.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {

	public abstract void setSequence(ArrayList<String> sequence);

	public abstract CarModel getCarModel();
}
