import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

public interface IBuilder {
	public void makeTitle(String title);

	public void makeString(String str) throws NoSuchAlgorithmException;

	public void makeItems(String[] items) throws NoSuchAlgorithmException;

	public void close() throws NoSuchAlgorithmException;

	public default void checkMaked(Supplier<Boolean> isMaked) throws NoSuchAlgorithmException {
		if (!isMaked.get()) {
			throw new NoSuchAlgorithmException();
		}
	};
}