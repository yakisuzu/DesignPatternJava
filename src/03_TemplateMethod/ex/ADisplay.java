package ex;

public abstract class ADisplay {
	protected abstract String open();

	protected abstract String print();

	protected abstract String close();

	public final String build() {
		StringBuilder sb = new StringBuilder();
		sb.append(open());
		for (int i = 0; i < 5; i++) {
			sb.append(print());
		}
		sb.append(close());
		return sb.toString();
	}
}