package morris.designpattern.prototype.b;

public class PrototypeClass implements Cloneable {

	@Override
	protected Object clone() {
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			//异常处理
		}
		return prototypeClass;
	}
}
