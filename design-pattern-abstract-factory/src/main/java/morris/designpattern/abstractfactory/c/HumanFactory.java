package morris.designpattern.abstractfactory.c;

import morris.designpattern.abstractfactory.c.human.Human;

public interface HumanFactory {

	Human createYellowHuman();
	Human createWhiteHuman();
	Human createBlackHuman();

}
