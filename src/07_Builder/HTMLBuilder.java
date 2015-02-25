import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

public class HTMLBuilder implements IBuilder {
	private static final String DIR = "src/07_Builder/";
	private String filename = null;
	private PrintWriter writer = null;
	private Supplier<Boolean> isMaked = () -> writer != null;

	@Override
	public void makeTitle(String title) {
		filename = DIR + title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}

	@Override
	public void makeString(String str) throws NoSuchAlgorithmException {
		checkMaked(isMaked);
		writer.println("<p>" + str + "</p>");
	}

	@Override
	public void makeItems(String[] items) throws NoSuchAlgorithmException {
		checkMaked(isMaked);
		writer.println("<ul>");
		for (String item : items) {
			writer.println("<li>" + item + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	public void close() throws NoSuchAlgorithmException {
		checkMaked(isMaked);
		writer.println("</body></html>");
		writer.close();
	}

	public String getResult() {
		return filename;
	}
}