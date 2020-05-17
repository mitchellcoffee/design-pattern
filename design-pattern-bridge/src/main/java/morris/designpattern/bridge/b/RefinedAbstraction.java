package morris.designpattern.bridge.b;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor _imp) {
		super(_imp);
	}

	//修正父类的行为
	@Override
	public void request() {
		super.request();
		super.getImp().doAnything();
	}
}
