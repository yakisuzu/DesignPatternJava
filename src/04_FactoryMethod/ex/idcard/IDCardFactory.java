package ex.idcard;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ex.framework.AFactory;

public class IDCardFactory extends AFactory<IDCard> {
	private Map<Integer, String> owners = new HashMap<>();

	@Override
	protected IDCard createProduct(String owner) {
		int newId = owners.keySet().stream().max(Comparator.naturalOrder()).orElse(0).intValue() + 1;
		return new IDCard(newId, owner);
	}

	@Override
	protected void registerProduct(IDCard product) {
		owners.put(product.getId(), product.getOwner());
	}

	public List<String> getOwners() {
		return owners.values().stream().collect(Collectors.toList());
	}
}