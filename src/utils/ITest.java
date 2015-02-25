import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public interface ITest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public default void setUp() throws Exception {
	}

	@After
	public default void tearDown() throws Exception {
	}

	default String[] spCRLF(String str) {
		return str.split("\n");
	}

	default void assertArray(String[] strArray, String[] checkArray) {
		assertThat(strArray.length, is(checkArray.length));

		for (int i = 0; i < strArray.length; i++) {
			assertThat(strArray[i], is(checkArray[i]));
		}
	}

	default String assertNotNull(String str) {
		assertThat(str, notNullValue());
		return str;
	}
}
