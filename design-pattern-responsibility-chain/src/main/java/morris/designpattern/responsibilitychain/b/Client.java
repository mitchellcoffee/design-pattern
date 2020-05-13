package morris.designpattern.responsibilitychain.b;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<IWoman> arrayList = new ArrayList();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Woman(rand.nextInt(3) + 1, "我要出去逛街"));
		}
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();

		father.setNext(husband);
		husband.setNext(son);

		for (IWoman women : arrayList) {
			father.handleMessage(women);
		}
	}
}
