package ex_7_1;

public class ManipuladorInverte extends ManipuladorAbstrato {
	protected String transformarString(String s) {
		StringBuffer buffer = new StringBuffer(s.length());
		for (int i = s.length(); i > 0; i--)
			buffer.append(s.charAt(i - 1));
		return buffer.toString();
	}
}
