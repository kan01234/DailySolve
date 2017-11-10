package com.dotterbear.codefight.strstr;

import org.junit.Assert;
import org.junit.Test;

public class StrstrTest {
	
	private Strstr strstr = new Strstr();
	
	@Test
	public void test() {
		Assert.assertEquals(1, strstr.strstr("xabcabzabc", "abc"));
		Assert.assertEquals(9, strstr.strstr("ffbefbdbacbccecaceddcbcaeaebfedfcfdbeecffdbbf", "cb"));
		Assert.assertEquals(-1, strstr.strstr("IckcYWDCgWkDBMudMVWZOBatEloOzayVtvsLgUSsaaFxZQAivbqtuGerRravCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKxNrWZl", "vCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKa"));
	}

}
