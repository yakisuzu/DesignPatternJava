package ex;

public class CharDisplay extends ADisplay {
	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	protected String open() {
		return "<<";
	}

	@Override
	protected String print() {
		return String.valueOf(ch);
	}

	@Override
	protected String close() {
		return ">>";
	}
}
