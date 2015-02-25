package ex.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	private Map<String, IProduct> showcase = new HashMap<>();

	public void register(String name, IProduct proto) {
		showcase.put(name, proto);
	}

	public IProduct create(String protoname) {
		IProduct p = showcase.get(protoname);
		return p.createClone();
	}
}