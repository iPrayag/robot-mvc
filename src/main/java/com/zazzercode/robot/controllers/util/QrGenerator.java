package com.zazzercode.robot.controllers.util;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.logging.Logger;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import net.glxn.qrgen.*;
import net.glxn.qrgen.image.*;
import net.glxn.qrgen.image.ImageType;
//import net.glxn.qrgen.vcard.VCard;

/**
 * @author prayag
 * 
 */
public class QrGenerator {
       public static Logger logger = Logger.getLogger(QrGenerator.class.getName());
       public static final String QR_PATH =  "/home/pupadhyay/scan2pay.JPG";

       public static void generateQr(String data){
        ByteArrayOutputStream outputStream = QRCode.from(data)
                                        .to(ImageType.JPG).stream();
 
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(QR_PATH));
 
            fileOutputStream.write(outputStream.toByteArray());
            logger.info("QR code is generated");

            fileOutputStream.flush();
            fileOutputStream.close();
 
        } catch (FileNotFoundException e) {
            logger.info("No suck file exists.");
        } catch (IOException e) {
            // Do Logging
        }
       }   
}
