package pra1;

import java.io.IOException;

public interface IFileIO {
	public void readFromFile(String filename) throws IOException;

	public void writeToFile(String filename) throws IOException;

	public void setValue(String key, String value);

	public String getValue(String key);
}
