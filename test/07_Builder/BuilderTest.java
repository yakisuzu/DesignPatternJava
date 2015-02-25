import static org.junit.Assert.fail;

import java.io.File;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

public class BuilderTest implements ITest {
	@Test
	public void test1() {
		TextBuilder textbuilder = new TextBuilder();
		Director director = new Director(textbuilder);
		director.construct();
		String result = textbuilder.getResult();
		System.out.println(result);
	}

	@Test
	public void test2() {
		HTMLBuilder htmlBuilder = new HTMLBuilder();
		Director director = new Director(htmlBuilder);
		director.construct();
		String result = htmlBuilder.getResult();
		System.out.println(result);

		new File(result).delete();
	}

	@Test
	public void test3() {
		TextBuilder textbuilder = new TextBuilder();

		try {
			textbuilder.makeString("");
			fail("should be able to throw");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		try {
			textbuilder.makeItems(new String[] {});
			fail("should be able to throw");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		try {
			textbuilder.close();
			fail("should be able to throw");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
