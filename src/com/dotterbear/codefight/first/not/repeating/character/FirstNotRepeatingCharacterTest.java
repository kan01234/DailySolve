package com.dotterbear.codefight.first.not.repeating.character;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstNotRepeatingCharacterTest {

	FirstNotRepeatingCharacter firstNotRepeatingCharacter = new FirstNotRepeatingCharacter();

	@Test
	public void test() {
		assertEquals(firstNotRepeatingCharacter.solve("abacabad"), 'c');
		assertEquals(firstNotRepeatingCharacter.solve("abacabaabacaba"), '_');
		assertEquals(firstNotRepeatingCharacter.solve("z"), 'z');
		assertEquals(firstNotRepeatingCharacter.solve("bcb"), 'c');
		assertEquals(firstNotRepeatingCharacter.solve("bcccccccb"), '_');
	}

}
