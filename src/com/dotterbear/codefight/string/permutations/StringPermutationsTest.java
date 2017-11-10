package com.dotterbear.codefight.string.permutations;

import org.junit.Assert;
import org.junit.Test;

public class StringPermutationsTest {

	private StringPermutations stringPermutations = new StringPermutations();

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[] { "ABC", "ACB", "BAC", "BCA", "CAB", "CBA" },
				stringPermutations.stringPermutations("CBA"));
		Assert.assertArrayEquals(new String[] { "AAB", "ABA", "BAA" }, stringPermutations.stringPermutations("ABA"));
		Assert.assertArrayEquals(
				new String[] { "ABDHS", "ABDSH", "ABHDS", "ABHSD", "ABSDH", "ABSHD", "ADBHS", "ADBSH", "ADHBS", "ADHSB",
						"ADSBH", "ADSHB", "AHBDS", "AHBSD", "AHDBS", "AHDSB", "AHSBD", "AHSDB", "ASBDH", "ASBHD",
						"ASDBH", "ASDHB", "ASHBD", "ASHDB", "BADHS", "BADSH", "BAHDS", "BAHSD", "BASDH", "BASHD",
						"BDAHS", "BDASH", "BDHAS", "BDHSA", "BDSAH", "BDSHA", "BHADS", "BHASD", "BHDAS", "BHDSA",
						"BHSAD", "BHSDA", "BSADH", "BSAHD", "BSDAH", "BSDHA", "BSHAD", "BSHDA", "DABHS", "DABSH",
						"DAHBS", "DAHSB", "DASBH", "DASHB", "DBAHS", "DBASH", "DBHAS", "DBHSA", "DBSAH", "DBSHA",
						"DHABS", "DHASB", "DHBAS", "DHBSA", "DHSAB", "DHSBA", "DSABH", "DSAHB", "DSBAH", "DSBHA",
						"DSHAB", "DSHBA", "HABDS", "HABSD", "HADBS", "HADSB", "HASBD", "HASDB", "HBADS", "HBASD",
						"HBDAS", "HBDSA", "HBSAD", "HBSDA", "HDABS", "HDASB", "HDBAS", "HDBSA", "HDSAB", "HDSBA",
						"HSABD", "HSADB", "HSBAD", "HSBDA", "HSDAB", "HSDBA", "SABDH", "SABHD", "SADBH", "SADHB",
						"SAHBD", "SAHDB", "SBADH", "SBAHD", "SBDAH", "SBDHA", "SBHAD", "SBHDA", "SDABH", "SDAHB",
						"SDBAH", "SDBHA", "SDHAB", "SDHBA", "SHABD", "SHADB", "SHBAD", "SHBDA", "SHDAB", "SHDBA" },
				stringPermutations.stringPermutations("SABHD"));
		Assert.assertArrayEquals(new String[] { "AE", "EA" },
				stringPermutations.stringPermutations("AE"));
	}

}
