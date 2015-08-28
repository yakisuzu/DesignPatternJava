package ex;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

public class TextBuilder implements IBuilder {
	private StringBuilder sb = new StringBuilder();
	private Supplier<Boolean> isMaked = () -> !sb.toString().isEmpty();

	@Override
	public void makeTitle(String title) {
		sb.append("====================\n");
		sb.append("『" + title + "』\n");
		sb.append("\n");
	}

	@Override
	public void makeString(String str) throws NoSuchAlgorithmException {
		checkMaked(isMaked);
		sb.append("■" + str + "\n");
		sb.append("\n");
	}

	@Override
	public void makeItems(String[] items) throws NoSuchAlgorithmException {
		checkMaked(isMaked);
		for (String item : items) {
			sb.append("  ・" + item + "\n");
		}
		sb.append("\n");
	}

	@Override
	public void close() throws NoSuchAlgorithmException {
		checkMaked(isMaked);
		sb.append("====================\n");
	}

	public String getResult() {
		return sb.toString();
	}
}