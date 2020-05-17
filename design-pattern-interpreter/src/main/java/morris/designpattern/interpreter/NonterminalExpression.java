package morris.designpattern.interpreter;

public class NonterminalExpression extends Expression {

	public NonterminalExpression(Expression... expressions) {

	}

	@Override
	public Object interpreter(Context ctx) {
		return null;
	}
}
