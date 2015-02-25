package ps2;

import java.util.ArrayList;
import java.util.List;

public class Triple {
	private static List<Triple> insList;

	{
		insList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			insList.add(new Triple());
		}
	}

	private Triple() {
	}

	public static Triple getInstance(int id) {
		return insList.get(id);
	}
}