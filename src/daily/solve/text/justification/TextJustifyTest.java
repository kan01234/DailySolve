package daily.solve.text.justification;

import org.junit.Assert;
import org.junit.Test;

public class TextJustifyTest {

	TextJustify textJustify = new TextJustify();

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{ "This    is    an", "example  of text", "justification.  " },
				textJustify.justify(new String[]{ "This", "is", "an", "example", "of", "text", "justification." }, 16));
		Assert.assertArrayEquals(null, textJustify.justify(new String[0], 16));
		Assert.assertArrayEquals(null, textJustify.justify(new String[]{ "This", "is", "an", "example", "of", "text", "justification." }, 0));
	}
}
