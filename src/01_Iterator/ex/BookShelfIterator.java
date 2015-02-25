package ex;
public class BookShelfIterator implements IIterator<Book> {
	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < bookShelf.getLength();
	}

	@Override
	public Book next() {
		return bookShelf.getBookAt(index++);
	}
}
