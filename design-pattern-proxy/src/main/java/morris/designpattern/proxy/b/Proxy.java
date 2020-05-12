package morris.designpattern.proxy.b;

public class Proxy implements Subject {

	private Subject subject = null;

	//通过构造函数传递代理者
	public Proxy(Subject _subject){
		this.subject = _subject;
	}

	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	//预处理
	private void before(){
		//do something
	}
	//善后处理
	private void after(){
		//do something
	}
}
