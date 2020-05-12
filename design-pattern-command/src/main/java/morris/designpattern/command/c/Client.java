package morris.designpattern.command.c;

public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();

		Receiver receiver = new ConcreteReciver1();
		Command command = new ConcreteCommand1(receiver);
		invoker.setCommand(command);
		invoker.action();
	}
}
