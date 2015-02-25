import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ex.Book;
import ex.BookShelf;
import ex.IIterator;

public class IteratorTest implements ITest{
	private final String b1 = "Around the World in 80 Days";
	private final String b2 = "Bible";
	private final String b3 = "Cinderella";
	private final String b4 = "Daddy-Long-Legs";

	private BookShelf initBookShelf() {
		BookShelf books = new BookShelf();
		books.appendBook(new Book(b1));
		books.appendBook(new Book(b2));
		books.appendBook(new Book(b3));
		books.appendBook(new Book(b4));
		return books;
	}

	@Test
	public void test1() {
		BookShelf books = new BookShelf();
		assertThat(books.getLength(), is(0));

		books.appendBook(new Book("test"));
		assertThat(books.getLength(), is(1));
		assertThat(books.getBookAt(0).getName(), is("test"));
	}

	@Test
	public void test2() {
		IIterator<Book> it = initBookShelf().iterator();
		assertThat(it.hasNext(), is(true));
		assertThat(it.next().getName(), is(b1));

		assertThat(it.hasNext(), is(true));
		assertThat(it.next().getName(), is(b2));

		assertThat(it.hasNext(), is(true));
		assertThat(it.next().getName(), is(b3));

		assertThat(it.hasNext(), is(true));
		assertThat(it.next().getName(), is(b4));

		assertThat(it.hasNext(), is(false));
	}
}
