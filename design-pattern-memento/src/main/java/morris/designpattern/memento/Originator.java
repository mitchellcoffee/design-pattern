package morris.designpattern.memento;

public class Originator {

	//内部状态
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(this.state);
	}

	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}
