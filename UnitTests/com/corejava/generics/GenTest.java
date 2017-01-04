package com.corejava.generics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class GenTest {

	@Test
	public void shouldReturnAGivenValue() {

		Integer value = new Integer(3);
		Gen<Integer> gen = new Gen<>();

		gen.setOb(value);

		assertEquals(value, gen.getOb());
	}
}
