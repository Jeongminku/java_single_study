package ch11.moduleQ;

public class IntegerCompareEX {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		System.out.println( obj1 == obj2 );
		System.out.println( obj3 == obj4 );
		
		
		//-128~127 사이는 값을 비교하고, 저 범위를 넘어가면 주소를 비교함.
	}

}
