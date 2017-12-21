package com.borry.org.webcomn.security;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.borry.org.model.entity.*;




/**
 * 加密
 * 
 * @author shanshouchen
 * 
 */
@Service("passwordHelper")
public class PasswordHelper {
	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

	@Value("${password.algorithmName}")
	private String algorithmName = "md5";
	@Value("${password.hashIterations}")
	private int hashIterations = 2;

	public void setRandomNumberGenerator(
			RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

//	public void encryptPassword(Ruser user) {
//		user.setSalt(randomNumberGenerator.nextBytes().toHex());
//		String newPassword = new SimpleHash(algorithmName, user.getPassword(),
//				ByteSource.Util.bytes(user.getCredentialsSalt()),
//				hashIterations).toHex();
//		user.setPassword(newPassword);
//	}
}
