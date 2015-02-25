import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ex.IPrint;
import ex.PrintBanner;
import ex1.APrint;

public class AdapterTest implements ITest {
	@Test
	public void test1() {
		IPrint p = new PrintBanner("Hello");
		assertThat(p.printWeek(), is("(Hello)"));
		assertThat(p.printStrong(), is("*Hello*"));
	}

	@Test
	public void test1Ex1() {
		APrint p = new ex1.PrintBanner("Hello");
		assertThat(p.printWeek(), is("(Hello)"));
		assertThat(p.printStrong(), is("*Hello*"));
	}
}
