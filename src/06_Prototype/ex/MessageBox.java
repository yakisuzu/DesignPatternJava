package ex;

import ex.framework.IProduct;

public class MessageBox implements IProduct {
	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public String use(String s) {
		int length = s.getBytes().length;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length + 4; i++) {
			sb.append(decochar);
		}
		sb.append("\n");
		sb.append(decochar + " " + s + " " + decochar + "\n");
		for (int i = 0; i < length + 4; i++) {
			sb.append(decochar);
		}
		sb.append("\n");
		return sb.toString();
	}

	@Override
	public IProduct createClone() {
		IProduct p = null;
		try {
			p = (IProduct) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}