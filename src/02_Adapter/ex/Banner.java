package ex;

public class Banner {
	private String str;

	public Banner(String str) {
		this.str = str;
	}

	public String showWithParen() {
		return "(" + str + ")";
	}

	public String showWithAster() {
		return "*" + str + "*";
	}
}
