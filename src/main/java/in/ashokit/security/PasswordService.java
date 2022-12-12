package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	public static String encode(String txt) {
		//bug 101 is fixing
		int a=10;
		int b=20;
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());

	}

	public static String decode(String encodeTxt) {
		//bug 121
		String s="Saurabh";
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeTxt);
		return new String(decode);
	}

	public static void main(String[] args) {

		String encode = PasswordService.encode("Saurabh");
		System.out.println(encode);
		String decode = PasswordService.decode(encode);
		System.out.println(decode);
	}
<<<<<<< Updated upstream
	public void saurabh() {}
=======
		public void m2() {}
>>>>>>> Stashed changes


}
