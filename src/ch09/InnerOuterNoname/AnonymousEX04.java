package ch09.InnerOuterNoname;

public class AnonymousEX04 {

	public static void main(String[] args) {
		Anonymous04 anony = new Anonymous04();
		anony.field.run(); //익명 객체 필드 사용
		anony.method1(); // 익명 객체 로컬변수 사용
		anony.method2(new Vehicle04() {// 익명 객체 매개값 사용
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		}); 
	
	}

}
