package org.application.manager.junit;

import org.junit.Assert;
import org.junit.Test;

public class SimpleJunitTest {

	@Test
	public void testShouldPass() {
		System.out.println("testShouldPass");
		Assert.assertTrue(true);
	}
}
