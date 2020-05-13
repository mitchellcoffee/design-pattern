package morris.designpattern.decorator.b;

public abstract class Decorator extends Component {

	private Component component = null;

	//通过构造函数传递被修饰者
	public Decorator(Component _component){
		this.component = _component;
	}

	@Override
	public void operate() {
		this.component.operate();
	}
}
