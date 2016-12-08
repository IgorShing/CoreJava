package com.corejava.interfaces;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AlphaBetaClassTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AlphaBetaClassTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AlphaBetaClassTest.class);
	}

	public void testShouldReturnDefaultValue() {
		AlphaBetaClass obj = new AlphaBetaClass();
		assertEquals("IAlpha interface", obj.reset());

	}

	/**
	 * The called method should return "This is procB."
	 */
	public void testShouldReturnTheDefinedString() {
		AlphaBetaClass obj = new AlphaBetaClass();
		assertEquals("This is procB.", obj.procB());

	}
}
