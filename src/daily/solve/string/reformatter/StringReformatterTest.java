package daily.solve.string.reformatter;

import org.junit.Assert;
import org.junit.Test;

public class StringReformatterTest {

	StringReformatter stringReformatter = new StringReformatter();

	@Test
	public void test() {
		Assert.assertEquals("24a0-r74k", stringReformatter.stringReformatting("2-4a0r7-4k", 4));
		Assert.assertEquals("24-a0r-74k", stringReformatter.stringReformatting("2-4a0r7-4k", 3));
		Assert.assertEquals("", stringReformatter.stringReformatting("-", 1));
		Assert.assertEquals("a-b-c-x-y-z", stringReformatter.stringReformatting("abc-xyz", 1));
		Assert.assertEquals("$-!5GR", stringReformatter.stringReformatting("-$!5G-R-", 4));
	}

}
