package ex;
import java.util.ArrayList;
import java.util.List;

public class BookShelf implements IAggregate<Book> {
	private List<Book> books;

	public BookShelf() {
		this.books = new ArrayList<>();
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		this.books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	@Override
	public IIterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
}
