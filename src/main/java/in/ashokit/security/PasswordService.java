package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	private int a = 10;
	private int b = 20;
	private int c = 30;
	private int d = 40;

	public static String encode(String txt) {

		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());

	}

	public static String decode(String encodeTxt) {

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


	public void process() {
		
		//logic code
}

	public void m1() {
		
		//logic

	}

}
