import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ex.framework.AFactory;
import ex.framework.AProduct;
import ex.idcard.IDCard;
import ex.idcard.IDCardFactory;

public class FactoryMethodTest implements ITest {
	@Test
	public void test1() {
		AFactory<IDCard> factory = new IDCardFactory();
		AProduct card1 = factory.create("ひろし");
		AProduct card2 = factory.create("ともら");
		AProduct card3 = factory.create("はなこ");
		assertThat(card1.use(), is("id:1,owner:ひろしのカードを使います。"));
		assertThat(card2.use(), is("id:2,owner:ともらのカードを使います。"));
		assertThat(card3.use(), is("id:3,owner:はなこのカードを使います。"));
	}
}
