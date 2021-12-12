package Demo;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class ChaCha20poly305 {

	private static final String ENCRYPT_ALGO="ChaCha20-Poly1305";
	private static final int NONCE_LEN=12;
	
	public byte[] encrypt(byte[] pText,SecretKey key)throws Exception{
		return encrypt(pText,key,getNonce());
		
	}
	
	public byte[] encrypt(byte[] pText,SecretKey key,byte[] nonce)throws Exception{
		Cipher cipher =Cipher.getInstance(ENCRYPT_ALGO);
		IvparameterSpec iv=new IcParamete
	}

	private Object getNonce() {
		// TODO Auto-generated method stub
		return null;
	}
}
