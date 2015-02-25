package ex;

import java.io.UnsupportedEncodingException;

public class StringDisplay extends ADisplay {
	private String str;
	private int width = 0;

	public StringDisplay(String str) {
		this.str = str;
		try {
			this.width = str.getBytes("MS932").length;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	private String printLine() {
		StringBuilder sb = new StringBuilder();
		sb.append("+");
		for (int i = 0; i < width; i++) {
			sb.append("-");
		}
		sb.append("+\n");
		return sb.toString();
	}

	@Override
	protected String open() {
		return printLine();
	}

	@Override
	protected String print() {
		return "|" + str + "|\n";
	}

	@Override
	protected String close() {
		return printLine();
	}
}
