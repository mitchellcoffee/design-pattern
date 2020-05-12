package morris.designpattern.template.b;

public abstract class AbstractClass {

	protected abstract void doSomething();

	protected abstract void doAnything();

	public final void templateMethod() {
		this.doSomething();
		this.doAnything();
	}

}
