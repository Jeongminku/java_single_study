package ch11.moduleQ;

public class DecodingEX09 {

	public static void main(String[] args) throws Exception {
		byte[] bytes = { -20, -107, -120, -21, -123, -107} ;
		String str = new String(bytes);//______________________
		System.out.println("str: " + str);

	}

}
/*
9. 다음 바이트 배열은 UTF-8 문자셋으로 인코딩한 데이터로, 다시 문자열로 디코딩해서 변수 data
에 저장하려고 합니다. 밑줄 친 곳에 들어갈 코드를 작성해보세요.




*/