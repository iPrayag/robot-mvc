package com.zazzercode.robot;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.zazzercode.robot.controllers.util.QrGenerator;
import com.zazzercode.robot.controllers.util.AuthenticationManager;
import java.util.logging.Logger;
import java.nio.charset.Charset;
import java.lang.Exception;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
        
	String encoding = "UTF-8";
	Logger logger = Logger.getLogger(AppTest.class.getName());

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
		String qrInfo = "Price : Nrs 1000";
	        QrGenerator.generateQr(qrInfo);
		assertTrue(true);
	}
	/**
	 * 
	 */
	public void testEncryptedQr() throws Exception{
		String encryptMe = "Nrs 1000";
		byte[] encryptedBytes = AuthenticationManager.encrypt(encryptMe);
		String encryptedData = new String(encryptedBytes, Charset.forName(encoding));
                logger.info("Encrpted Data : "+encryptedData);

	        QrGenerator.generateQr(encryptedData);
		assertTrue(true);
	}


	public void testEncryption() throws Exception {
		String encryptMe = "Price : Nrs 1000";
		byte[] encryptedBytes = AuthenticationManager.encrypt(encryptMe);
		String encryptedData = new String(encryptedBytes, Charset.forName(encoding));
                logger.info("Encrpted Data : "+encryptedData);
	}

}
