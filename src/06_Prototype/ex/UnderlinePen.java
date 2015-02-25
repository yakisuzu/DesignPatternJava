package ex;

import ex.framework.IProduct;

public class UnderlinePen implements IProduct {
	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public String use(String s) {
		int length = s.getBytes().length;
		StringBuilder sb = new StringBuilder();
		sb.append("\"" + s + "\"\n");
		sb.append(" ");
		for (int i = 0; i < length; i++) {
			sb.append(ulchar);
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