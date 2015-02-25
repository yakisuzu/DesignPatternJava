package ex;

public enum Singleton {
	INSTANCE;

	private Singleton() {
	}

	private int id = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}