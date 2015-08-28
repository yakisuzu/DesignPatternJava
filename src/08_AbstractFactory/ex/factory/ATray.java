package ex.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class ATray extends AItem {
	protected List<AItem> tray = new ArrayList<>();

	public ATray(String caption) {
		super(caption);
	}

	public void add(AItem item) {
		tray.add(item);
	}
}