package ch11.moduleQ;

public class StringBuilderEX10 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
        for (int i = 1 ; i <= 100; i++) {
            sb.append(i);
        }
        System.out.println(sb);

	}

}
/*
10. 다음 코드는 1부터 100까지의 숫자를 통 문자열로 만들기 위해 += 연산자를 이용해 100번 반
복하고 있습니다. 이것은 곧 100개 이상의 String 객체를 생성하는 결과를 만들기 때문에 좋은 코
드라고 볼 수 없습니다. StringBuilder를 사용해서 좀 더 효율적인 코드로 개선해보세요.
	String str = "";
	for (int i = 1; i <= 100; i++) {
		str += i;
	}
	 System.out.println(str); 을 개량할것.


*/