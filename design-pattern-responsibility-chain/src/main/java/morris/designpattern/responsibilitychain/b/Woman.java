package morris.designpattern.responsibilitychain.b;

public class Woman implements IWoman {

	private int type = 0;
	private String request = "";

	public Woman(int _type,String _request){
		this.type = _type;
		//为了便于显示，在这里做了点处理
		switch(this.type){
			case 1:
				this.request = "女儿的请求是：" + _request;
				break;
			case 2:
				this.request = "妻子的请求是：" + _request;
				break;
			case 3:
				this.request = "母亲的请求是：" + _request;
		}
	}

	public int getType() {
		return this.type;
	}

	public String getRequest() {
		return this.request;
	}
}
