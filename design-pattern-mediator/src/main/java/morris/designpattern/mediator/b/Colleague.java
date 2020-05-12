package morris.designpattern.mediator.b;

public abstract class Colleague {

	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
