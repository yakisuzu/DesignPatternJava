package ex.factory;

public abstract class AItem {
	protected String caption;

	public AItem(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();
}