package com.zazzercode.robot.controllers.util;

import java.io.*;
import java.lang.*;
import java.util.*;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import net.glxn.qrgen.*;
import net.glxn.qrgen.image.*;
//import net.glxn.qrgen.vcard.VCard;

/**
 * @author prayag
 * 
 */
public class QrGenerator {
       public static void generateQr(String data){
		// get QR file from text using defaults
	       File file = QRCode.from(data).file();

	       // get QR stream from text using defaults
	       ByteArrayOutputStream stream = QRCode.from(data).stream();

	       // override the image type to be JPG
	       QRCode.from(data).to(ImageType.JPG).file();
	       QRCode.from(data).to(ImageType.JPG).stream();

	       // override image size to be 250x250
	       QRCode.from(data).withSize(250, 250).file();
	       QRCode.from(data).withSize(250, 250).stream();

	       // override size and image type
	       QRCode.from(data).to(ImageType.GIF).withSize(250, 250).file();
	       QRCode.from(data).to(ImageType.GIF).withSize(250, 250).stream();

	       // supply own outputstream
	       // QRCode.from(data).to(ImageType.PNG).writeTo(outputStream);

	       // supply own file name
	       QRCode.from(data).file("QRCode");

	       // supply charset hint to ZXING
	       QRCode.from(data).withCharset("UTF-8");

	       // encode contact data as vcard using defaults
	       /*
	       VCard prayag = new VCard("Prayag Upd")
		       .setEmail("prayag.upd@gmail.com")
		       .setAddress("Ghattekulo-32, Kathmandu")
		       .setTitle("Mister")
		       .setCompany("Z Inc.")
		       .setPhonenumber("9849026704")
		       .setWebsite("www.prayag-waves.blogspot.com");
	       QRCode.from(prayag).file();
	       */

       }   
}
