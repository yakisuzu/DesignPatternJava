import org.junit.Test;

import ex.factory.AFactory;
import ex.factory.ALink;

public class AbstractFactoryTest implements ITest {
	@Test
	public void test1() {
		// FIXME
		AFactory factory = AFactory.getFactory(AFactory.class);

		ALink asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		ALink yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
		ALink us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");

		// TODO continue
	}
}
