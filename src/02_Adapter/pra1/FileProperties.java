package pra1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements IFileIO {
	private final String dir = "src/02_Adapter/";
	private Properties p = new Properties();

	BufferedWriter bw;

	@Override
	public void readFromFile(String filename) throws IOException {
		File f = new File(dir + filename);
		if (!f.exists()) {
			f.createNewFile();
		}
		p.load(new FileInputStream(f));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		p.store(new FileOutputStream(dir + filename), "add comments");
	}

	@Override
	public void setValue(String key, String value) {
		p.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return p.getProperty(key);
	}
}
