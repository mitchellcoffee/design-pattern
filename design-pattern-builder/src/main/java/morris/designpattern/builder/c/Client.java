package morris.designpattern.builder.c;

import morris.designpattern.builder.c.car.BMWModel;
import morris.designpattern.builder.c.car.BenzModel;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom");  //客户要求，run时候时候先发动引擎
		sequence.add("start");  //启动起来
		sequence.add("stop");   //开了一段就停下来

		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		BenzModel benz = (BenzModel)benzBuilder.getCarModel();
		benz.run();

		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
		bmw.run();
	}
}
