package com.corejava.lambda;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LambdaDemoTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public LambdaDemoTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(LambdaDemoTest.class);
	}

	public void testShouldReturnDefaultValue() {
		LambdaDemo lambdaDemo = new LambdaDemo();

		// The actual path is written in the config.properties

		assertEquals(123.8958, lambdaDemo.getDefaultValue());
	}
}