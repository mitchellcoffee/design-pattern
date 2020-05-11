package morris.designpattern.abstractfactory.c;

import morris.designpattern.abstractfactory.c.human.FemaleBlackHuman;
import morris.designpattern.abstractfactory.c.human.FemaleWhiteHuman;
import morris.designpattern.abstractfactory.c.human.FemaleYellowHuman;
import morris.designpattern.abstractfactory.c.human.Human;

public class FemaleFactory implements HumanFactory {
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}
}
