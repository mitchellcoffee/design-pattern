package morris.designpattern.responsibilitychain.b;

public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;

	private int level = 0;

	private Handler nextHandler;

	public Handler(int level) {
		this.level = level;
	}

	public final void handleMessage(IWoman woman) {
		if (woman.getType() == this.level) {
			this.response(woman);
		} else {
			if (this.nextHandler != null) {
				this.nextHandler.handleMessage(woman);
			} else {
				System.out.println("---没地方请示了，按不同意处理---\n");
			}
		}
	}

	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	//有请示那当然要回应
	protected abstract void response(IWoman women);
}
