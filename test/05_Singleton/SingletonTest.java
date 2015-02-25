import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ex.Singleton;

public class SingletonTest implements ITest {
	@Test
	public void test1() {
		Singleton s1 = Singleton.INSTANCE;
		Singleton s2 = Singleton.INSTANCE;
		assertThat(s1, is(s2));

		s1.setId(1);
		assertThat(s2.getId(), is(1));
	}
}
