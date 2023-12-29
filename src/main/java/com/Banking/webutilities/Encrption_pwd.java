package com.Banking.webutilities;

import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class Encrption_pwd 
{
	public static String encrpt(String strToencrypt)
	{
		try
		{
			final String SECRECT_KEY = "Test123@#$%^&*()DX";
			final String SALT = "TESTING!!!!!!!";
			byte[] iv = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
			IvParameterSpec ivspec = new IvParameterSpec(iv);
			
			// Create secretKeyFactory object
			
			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			
			// Create keySpec object and assign with constructor
			
			KeySpec spec = new PBEKeySpec(SECRECT_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
			
			// Return encrypted string
			
			return Base64.getEncoder().encodeToString(cipher.doFinal(strToencrypt.getBytes(StandardCharsets.UTF_8)));
		}
		
		catch (Exception e)
		{
			System.out.print("Error while encryption :"+ e.toString());
		}
			
		return null;
		
	}
	
	public static void main(String[] args)
	{
		System.out.print(encrpt("Massmutual*1238"));
	}


}
