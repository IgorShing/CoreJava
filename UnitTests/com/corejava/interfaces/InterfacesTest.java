package com.corejava.interfaces;

import com.corejava.lambda.LambdaDemoTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class InterfacesTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public InterfacesTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(LambdaDemoTest.class);
	}

	public void testShouldReturnDefaultValue() {

		MyIFImp myIF = new MyIFImp();
		// The actual path is written in the config.properties

		assertEquals(100, myIF.getNumber());
		assertEquals("Default String", myIF.getString());
	}

}
