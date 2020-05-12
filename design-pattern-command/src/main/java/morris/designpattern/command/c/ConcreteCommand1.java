package morris.designpattern.command.c;

public class ConcreteCommand1 extends Command {

	private Receiver receiver;

	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		this.receiver.doSomething();
	}
}
