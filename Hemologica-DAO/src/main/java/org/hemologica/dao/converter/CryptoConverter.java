package org.hemologica.dao.converter;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.Converter;

import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;

//link: http://www.thoughts-on-java.org/how-to-use-jpa-type-converter-to/

@Converter
public class CryptoConverter {

	private static final String ALGORITHM = "AES/ECB/PKCS5Padding";
//	private static final byte[] KEY = "HEMOLOGICA1234HEMOLOGICA".getBytes();
	private static final byte[] KEY;
	
	static {
		//reemplazar por lectura de clave de un keystore configurable
		KEY = BASE64DecoderStream.decode("MbZBwR2U77CV6px61BfJIg==".getBytes());
		
	    // keystoreLocation : url del keystore
	    // keystorePass : password del keystore
	    // alias : alias de la clave en el keystore
	    // keyPass : password de la clave en el keystore
//	    InputStream keystoreStream = new FileInputStream(keystoreLocation);  
//	    KeyStore keystore = KeyStore.getInstance("JCEKS");  
//	    keystore.load(keystoreStream, keystorePass.toCharArray());  
//	    if (!keystore.containsAlias(alias)) {  
//	        throw new RuntimeException("Alias for key not found");  
//	    }  
//	    KEY = keystore.getKey(alias, keyPass.toCharArray());  
	}
	

	public static String encrypt(String a) {
//		 do some encryption
		Key key = new SecretKeySpec(KEY, "AES");
		try {
			Cipher c = Cipher.getInstance(ALGORITHM);
			c.init(Cipher.ENCRYPT_MODE, key);
			return new String(BASE64EncoderStream.encode(c.doFinal(a.getBytes())));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
//		return a;
	}

	public static String decrypt(String a) {
//		 do some decryption
//		return a;
		Key key = new SecretKeySpec(KEY, "AES");
		try {
			Cipher c = Cipher.getInstance(ALGORITHM);
			c.init(Cipher.DECRYPT_MODE, key);
			return new String(c.doFinal(BASE64DecoderStream.decode(a.getBytes())));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
//		return a;
	}
	
	
	 public static void main(String[] args) throws Exception {
		 
		 
//		 try{
//
//			 String var = "hola bruno";
//			 System.out.println("base64.encode(key): "+ new String(BASE64EncoderStream.encode(KEY)));
//			 System.out.println("text: "+ var);
//			 System.out.println("encrypt(text): "+ CryptoConverter.encrypt(var));
//			 System.out.println("decrypt(encrypt(text)): "+ CryptoConverter.decrypt(CryptoConverter.encrypt(var)));
//			 
//		 }catch(Exception ex){
//			 ex.printStackTrace();
//		 }
		 		 
		 
	 }

}
