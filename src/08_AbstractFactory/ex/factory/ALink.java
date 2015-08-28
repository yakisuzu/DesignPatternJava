package ex.factory;

public abstract class ALink extends AItem {
	protected String url;

	public ALink(String caption, String url) {
		super(caption);
		this.url = url;
	}
}