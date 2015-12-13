package org.hemologica.dao.converter;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.Converter;
import com.sun.mail.util.BASE64EncoderStream;

//link: http://www.thoughts-on-java.org/how-to-use-jpa-type-converter-to/

@Converter
public class CryptoConverter {

	private static final String ALGORITHM = "AES/ECB/PKCS5Padding";
	private static final byte[] KEY = "HEMOLOGICA1234HEMOLOGICA".getBytes();
	
	
//	static{
		//TODO inicializar clave desde el keystore
//	}
	

//	public String convertToDatabaseColumn(String attribute) {
//		return CryptoConverter.encrypt(attribute);
//	}
//
//	public String convertToEntityAttribute(String dbData) {
//		return CryptoConverter.decrypt(dbData);
//
//	}

	public static String encrypt(String a) {
//		 do some encryption
//		Key key = new SecretKeySpec(KEY, "AES");
//		try {
//			Cipher c = Cipher.getInstance(ALGORITHM);
//			c.init(Cipher.ENCRYPT_MODE, key);
//			return new String(BASE64EncoderStream.encode(c.doFinal(a.getBytes())));
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
		
		return a;
	}

//	public static String decrypt(String a) {
//		 do some decryption
//		Key key = new SecretKeySpec(KEY, "AES");
//		try {
//			Cipher c = Cipher.getInstance(ALGORITHM);
//			c.init(Cipher.DECRYPT_MODE, key);
//
//			return new String(c.doFinal(BASE64DecoderStream.decode(a.getBytes())));
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//		return a;
//	}

}
