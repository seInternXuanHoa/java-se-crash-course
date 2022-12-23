package gpcoder.java.se.base64;

import java.util.Base64;

public class Base64IST {
	public static void main(String[] args) {
		String author = "seInternXuanHoa";
		String url = "https://se.intern.xuanhoa.com";
		String encodeToString = Base64.getEncoder().encodeToString(author.getBytes());
		String decode = new String(Base64.getDecoder().decode(encodeToString));
		String urlEncodeToString = Base64.getUrlEncoder().encodeToString(url.getBytes());
		String urlDecode = new String(Base64.getUrlDecoder().decode(urlEncodeToString));
		String mineEncodeToString = Base64.getMimeEncoder().encodeToString(url.getBytes());
		String mineDecode = new String(Base64.getMimeDecoder().decode(mineEncodeToString));

		System.out.println("Encode: " + encodeToString);
		System.out.println("Decode: " + decode);
		System.out.println("URL Encode: " + urlEncodeToString);
		System.out.println("URL Decode: " + urlDecode);
		System.out.println("Mine Encode: " + mineEncodeToString);
		System.out.println("Mine Decode: " + mineDecode);
	}
}
