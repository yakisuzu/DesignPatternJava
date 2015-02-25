import org.junit.Test;

import ex.ADisplay;
import ex.CharDisplay;
import ex.StringDisplay;

public class TemplateMethodTest implements ITest {
	@Test
	public void test1() {
		ADisplay d1 = new CharDisplay('H');
		ADisplay d2 = new StringDisplay("Hello, World");
		ADisplay d3 = new StringDisplay("こんにちは");

		assertArray(spCRLF(d1.build()), new String[] { "<<HHHHH>>" });
		assertArray(spCRLF(d2.build()), new String[] { "+------------+", "|Hello, World|", "|Hello, World|", "|Hello, World|", "|Hello, World|", "|Hello, World|", "+------------+" });
		assertArray(spCRLF(d3.build()), new String[] { "+----------+", "|こんにちは|", "|こんにちは|", "|こんにちは|", "|こんにちは|", "|こんにちは|", "+----------+" });
	}
}
