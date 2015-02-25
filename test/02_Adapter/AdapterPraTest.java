import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import pra1.FileProperties;
import pra1.IFileIO;

public class AdapterPraTest implements ITest {
	private static final String DIR = "src/02_Adapter/";

	@Test
	public void test1() {
		IFileIO f = new FileProperties();
		try {
			f.readFromFile("file1.properties");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("file2.properties");
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}

		File f1 = new File(DIR + "file1.properties");
		try (BufferedReader bf = new BufferedReader(new FileReader(f1))) {
			assertThat(bf.readLine(), nullValue());
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		} finally {
			f1.delete();
		}

		File f2 = new File(DIR + "file2.properties");
		try (BufferedReader bf = new BufferedReader(new FileReader(f2))) {
			assertThat(assertNotNull(bf.readLine()), is("#add comments"));
			assertThat(assertNotNull(bf.readLine()), notNullValue());
			assertThat(assertNotNull(bf.readLine()), is("day=21"));
			assertThat(assertNotNull(bf.readLine()), is("year=2004"));
			assertThat(assertNotNull(bf.readLine()), is("month=4"));
			assertThat(bf.readLine(), nullValue());
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		} finally {
			f2.delete();
		}
	}
}
