package morris.designpattern.proxy.c;

public class RealSubject implements Subject {
	@Override
	public void doSomething(String str) {
		System.out.println("do something!---->" + str);
	}
}
