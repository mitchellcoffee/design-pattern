package morris.designpattern.abstractfactory.c;

import morris.designpattern.abstractfactory.c.human.Human;
import morris.designpattern.abstractfactory.c.human.MaleBlackHuman;
import morris.designpattern.abstractfactory.c.human.MaleWhiteHuman;
import morris.designpattern.abstractfactory.c.human.MaleYellowHuman;

public class MaleFactory implements HumanFactory {
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}
}
