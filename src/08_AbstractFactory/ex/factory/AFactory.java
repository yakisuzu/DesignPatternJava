package ex.factory;

public abstract class AFactory {
	public static AFactory getFactory(Class<? extends AFactory> clazz) {
		AFactory factory = null;
		try {
			factory = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return factory;
	}

	public abstract ALink createLink(String caption, String url);

	public abstract ATray createTray(String caption);

	public abstract APage createPage(String title, String author);
}