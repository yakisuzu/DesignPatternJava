package ex.framework;

public abstract class AFactory<T extends AProduct> {
	public final T create(String owner) {
		T p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract T createProduct(String owner);

	protected abstract void registerProduct(T product);
}