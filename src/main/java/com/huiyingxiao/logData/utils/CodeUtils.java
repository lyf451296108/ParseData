package com.huiyingxiao.logData.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * 编码工具类，包括：
 * <li> BASE64编码
 * <li> DES数据加密
 * <li> URL编码
 * 
 * @author finch.lin
 */
@SuppressWarnings("restriction")
public class CodeUtils {

	// 数据加密算法：
	private static final String ALGORITHM = "DES";
	private static final String SHA1PRNG = "SHA1PRNG";
	
	// -------------------------------------------------------------------------
	// DES：加密和解密
	// -------------------------------------------------------------------------
	
	/**
	 * 加密(采用"UTF-8"编码)
	 * @param key				密匙
	 * @param srcData			源数据
	 */
	public static byte[] encrypt(String key, String srcData) throws Exception {
		return encrypt(key.getBytes("UTF-8"), srcData.getBytes("UTF-8"));
	}
	
	/**
	 * 加密
	 * @param key				密匙
	 * @param srcData			源数据
	 */
	public static byte[] encrypt(byte[] key, byte[] srcData) throws Exception {
		return main(key, srcData, Cipher.ENCRYPT_MODE);
	}
	
	/**
	 * 解密(采用"UTF-8"编码)
	 * @param key				密匙
	 * @param desData			DES加密过的数据
	 */
	public static byte[] decrypt(String key, String desData) throws Exception {
		return decrypt(key.getBytes("UTF-8"), desData.getBytes("UTF-8"));
	}
	
	/**
	 * 解密(采用"UTF-8"编码)
	 * @param key				密匙
	 * @param desData			DES加密过的数据
	 */
	public static byte[] decrypt(String key, byte[] desData) throws Exception {
		return decrypt(key.getBytes("UTF-8"), desData);
	}
	
	/**
	 * 解密
	 * @param key				密匙
	 * @param desData			DES加密过的数据
	 */
	public static byte[] decrypt(byte[] key, byte[] desData) throws Exception {
		return main(key, desData, Cipher.DECRYPT_MODE);
	}
	
	/**
	 * 主操作方法
	 * @param key				密匙
	 * @param data				数据
	 * @param opMode			操作类型
	 */
	private static byte[] main(byte[] key, byte[] data, int opMode) throws Exception {
		// 创建一个密匙工厂：
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
		// 根据原始密匙数据创建一个DESKeySpec对象
		DESKeySpec dks = new DESKeySpec(key);
		// 把DESKeySpec对象转换成一个SecretKey对象
		SecretKey secretKey = keyFactory.generateSecret(dks);
		
		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		// 得到一个可信任的随机数源
		SecureRandom sr = SecureRandom.getInstance(SHA1PRNG);
		sr.setSeed(key);
		// 用密匙初始化Cipher对象
		cipher.init(opMode, secretKey, sr);
		
		// 正式执行操作
		return cipher.doFinal(data);
	}
	
	
	// -------------------------------------------------------------------------
	// DES：获取密钥
	// -------------------------------------------------------------------------
		
	/** 得到一个随机的密钥： */
	public static byte[] getKey() throws Exception {
		return getKey(null);
	}
	
	/**
	 * 根据目标参数得到一个特定的密钥
	 * @param seed				目标参数
	 */
	public static byte[] getKey(byte[] seed) throws Exception {
		// 得到一个可信任的随机数源
		SecureRandom secureRandom = null;
		if (seed != null) {
			secureRandom = new SecureRandom(seed);
		} else {
			secureRandom = new SecureRandom();
		}
		
		// 根据算法生成一个KeyGenerator对象及初始化
		KeyGenerator kg = KeyGenerator.getInstance(ALGORITHM);
		kg.init(secureRandom);
		
		// 生成密匙及得到数据
		SecretKey secretKey = kg.generateKey();
		return secretKey.getEncoded();
	}
	
	
	// -------------------------------------------------------------------------
	// BASE64：编码和解码
	// -------------------------------------------------------------------------
	
	/**
	 * BASE64编码(采用"UTF-8"编码)
	 * @param srcData			源数据
	 */
	public static String base64Encode(String srcData) {
		return base64Encode(srcData, "UTF-8");
	}
	
	/**
	 * BASE64编码
	 * @param srcData			源数据
	 * @param charset			编码
	 */
	public static String base64Encode(String srcData, String charset) {
		try {
			return base64Encode(srcData.getBytes(charset));
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("编码错误");
		}
	}
	
	/**
	 * BASE64编码
	 * @param srcData			源数据
	 */
	public static String base64Encode(byte[] srcData) {
		return new BASE64Encoder().encode(srcData);
	}
	
	/**
	 * BASE64解码(采用"UTF-8"编码)
	 * @param b64Data			BASE64编码过的数据
	 */
	public static byte[] base64Decode(byte[] b64Data) throws Exception {
		return base64Decode(b64Data, "UTF-8");
	}
	
	/**
	 * BASE64解码
	 * @param b64Data			BASE64编码过的数据
	 * @param charset			编码
	 */
	public static byte[] base64Decode(byte[] b64Data, String charset) throws Exception {
		return base64Decode(new String(b64Data, charset));
	}
	
	/**
	 * BASE64解码
	 * @param b64Data			BASE64编码过的数据
	 */
	public static byte[] base64Decode(String b64Data) throws Exception {
		return new BASE64Decoder().decodeBuffer(b64Data);
	}
	
	
	// -------------------------------------------------------------------------
	// URL：编码和解码
	// -------------------------------------------------------------------------
	
	/**
	 * URL编码(采用"UTF-8"编码)
	 * @param srcData			源数据
	 */
	public static String urlEncode(String srcData) {
		try {
			return URLEncoder.encode(srcData, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("编码错误");
		}
	}
	
	/**
	 * URL编码(采用"UTF-8"编码)
	 * @param data				URL编码过的数据
	 */
	public static String urlDecode(String data) {
		try {
			return URLDecoder.decode(data, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("编码错误");
		}
	}
	
	/**
	 * 检测一个字符串是否为"URL编码过的字符串"
	 * <br> 规则1：a-z、A-Z、0-9、"."、"-"、"*"、"_"保持不变
	 * <br> 规则2：空格" "转为加号"+"
	 * <br> 规则3：其它转为"%xy"
	 * @param data				URL编码过的数据
	 * @return					true:正确、false:错误
	 */
	public static boolean checkIsUrlStr(String data) {
		if (data == null) {
			return false;
		} else {
			return data.matches("[a-zA-Z0-9_%\\.\\*\\+\\-]+");
		}
	}
	
	
	// -------------------------------------------------------------------------
	// BASE64和DES加密结合：
	// -------------------------------------------------------------------------
	
	/**
	 * 先进行BASE64编码，再进行DES加密(采用"UTF-8"编码)
	 * @param key				密匙
	 * @param srcData			源数据
	 */
	public static byte[] encryptForBase64Des(String key, String srcData) throws Exception {
		String base64Str = base64Encode(srcData);
		return encrypt(key.getBytes("UTF-8"), base64Str.getBytes("UTF-8"));
	}
	
	/**
	 * 先进行DES解密，再进行BASE64解码(采用"UTF-8"编码)
	 * @param key				密匙
	 * @param data				先经过BASE64编码，再经过DES加密的数据
	 */
	public static String decryptForDesBase64(String key, byte[] data) throws Exception {
		byte[] b64Data = decrypt(key.getBytes("UTF-8"), data);
		return new String(base64Decode(b64Data), "UTF-8");
	}
	
	
	// -------------------------------------------------------------------------
	// BASE64和URL结合：
	// -------------------------------------------------------------------------

	/**
	 * 先进行BASE64编码，再进行URL编码(采用"UTF-8"编码)
	 * @param srcData			源数据
	 */
	public static String encryptForBase64URL(String srcData) {
		return urlEncode(base64Encode(srcData));
	}
	
	/**
	 * 先进行URL解码，再进行BASE64解码(采用"UTF-8"编码)
	 * @param data				先进行BASE64编码，再进行URL编码的数据
	 */
	public static String decryptForURLBase64(String data) throws Exception {
		return new String(base64Decode(urlDecode(data)), "UTF-8");
	}
	
}

