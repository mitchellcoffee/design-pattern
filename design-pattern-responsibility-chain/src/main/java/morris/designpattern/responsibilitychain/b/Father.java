package morris.designpattern.responsibilitychain.b;

public class Father extends Handler {

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	protected void response(IWoman women) {
		System.out.println("--------女儿向父亲请示-------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是:同意\n");
	}
}
