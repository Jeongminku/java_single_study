package ch11.moduleQ;

import java.util.StringTokenizer;

public class StringTokenizer11 {

	public static void main(String[] args) {
		String data = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(data, ",");
		System.out.println(st.countTokens());
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
