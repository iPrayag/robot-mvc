package com.zazzercode.robot;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.zazzercode.robot.controllers.util.QrGenerator;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testQr() {
		String qrInfo = "Nrs 1000";
	        QrGenerator.generateQr(qrInfo);
		assertTrue(true);
	}
}
