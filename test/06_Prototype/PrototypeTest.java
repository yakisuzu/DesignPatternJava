import org.junit.Test;

import ex.MessageBox;
import ex.UnderlinePen;
import ex.framework.IProduct;
import ex.framework.Manager;

public class PrototypeTest implements ITest {
	@Test
	public void test1() {
		Manager manager = new Manager();
		manager.register("strong message", new UnderlinePen('~'));
		manager.register("warning box", new MessageBox('*'));
		manager.register("slash box", new MessageBox('/'));

		assertUse(manager, "strong message", "Hello, world.", new String[] { "\"Hello, world.\"", " ~~~~~~~~~~~~~" });
		assertUse(manager, "warning box", "Hello, world.", new String[] { "*****************", "* Hello, world. *", "*****************" });
		assertUse(manager, "slash box", "Hello, world.", new String[] { "/////////////////", "/ Hello, world. /", "/////////////////" });
	}

	private void assertUse(Manager m, String create, String use, String[] checkArray) {
		IProduct p = m.create(create);
		String ps = p.use(use);
		assertArray(spCRLF(ps), checkArray);
		System.out.println(ps);
	}
}
