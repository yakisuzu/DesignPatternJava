package ex.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class APage {
	protected String title;
	protected String author;
	protected List<AItem> content = new ArrayList<>();

	public APage(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(AItem item) {
		content.add(item);
	}

	public void output() {
		String filename = title + ".html";
		try (Writer writer = new FileWriter(filename)) {
			writer.write(this.makeHTML());
			System.out.println(filename + " を作成しました。");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public abstract String makeHTML();
}