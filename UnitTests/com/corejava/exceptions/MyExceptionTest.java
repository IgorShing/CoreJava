package com.corejava.exceptions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import junit.framework.TestCase;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class MyExceptionTest extends TestCase {

	@Test(expected = ArithmeticException.class)
	public void testDivisionWithException() {
		int i = 1 / 0;
	}

	@Test(expected = MyException.class)
	public void testShouldThrowException() throws MyException {
		throw new MyException(1);
	}
}
