package morris.designpattern.composite;

public class Client {

	public static void main(String[] args) {
		Composite root = new Composite();
		root.doSomething();

		Composite branch = new Composite();
		Leaf leaf = new Leaf();
		root.add(branch);
		branch.add(leaf);

		display(root);
	}

	//通过递归遍历树
	public static void display(Composite root) {
		for (Component c : root.getChildren()) {
			if (c instanceof Leaf) { //叶子节点
				c.doSomething();
			} else { //树枝节点
				display((Composite) c);
			}
		}
	}
}
