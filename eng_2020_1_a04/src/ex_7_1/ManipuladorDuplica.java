package ex_7_1;

public class ManipuladorDuplica extends ManipuladorAbstrato {
	protected String transformarString(String s) {
		return s + " " + s;
	}
}