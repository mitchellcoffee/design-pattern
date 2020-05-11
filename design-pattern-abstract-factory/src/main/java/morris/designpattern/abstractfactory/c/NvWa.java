package morris.designpattern.abstractfactory.c;

import morris.designpattern.abstractfactory.c.human.Human;

public class NvWa {

	public static void main(String[] args) {

		HumanFactory maleHumanFactory = new MaleFactory();
		HumanFactory femaleHumanFactory = new FemaleFactory();

		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();

		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
	}
}
