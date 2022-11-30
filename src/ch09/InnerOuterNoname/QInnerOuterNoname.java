package ch09.InnerOuterNoname;

public class QInnerOuterNoname {
	/*
	1. 중첩 멤버 클래스에 대한 설명으로 틀린 것은 무엇입니까? 4
	이유 : 호출까지만 가능하고 사용은 불가능하다. 
			➊ 인스턴스 멤버 클래스는 바깥 클래스의 객체가 있어야 사용될 수 있다.
			➋ 정적 멤버 클래스는 바깥 클래스의 객체가 없어도 사용될 수 있다.
			➌ 인스턴스 멤버 클래스 내부에는 바깥 클래스의 모든 필드와 메소드를 사용할 수 있다.
			➍ 정적 멤버 클래스 내부에는 바깥 클래스의 인스턴스 필드를 사용할 수 있다.

	2. 로컬 클래스에 대한 설명으로 틀린 것은 무엇입니까? 3
	이유 : 로컬 클래스는 static 키워드를 사용할 수 없다.
			➊ 로컬 클래스는 메소드 내부에 선언된 클래스를 말한다.
			➋ 로컬 클래스는 바깥 클래스의 필드와 메소드를 사용할 수 있다.
			➌ 로컬 클래스는 static 키워드를 이용해서 정적 클래스로 만들 수 있다.
			➍ final 특성을 가진 매개변수나 로컬 변수만 로컬 클래스 내부에서 사용할 수 있다.
			
	3. Action 인터페이스는 다음과 같이 work( ) 추상 메소드를 가지고 있습니다. 
	   ActionExample클래스의 main( ) 메소드에서 Action의 익명 구현 객체를 만들어 실행 결과와 동일하게 나오도록
	   박스 안에 들어갈 코드를 작성해보세요

		실행결과 : 복사를 합니다.
	
	
	4. AnonymousExample 클래스의 실행 결과를 보고, Vehicle 인터페이스의 익명 구현 객체를
		필드와 로컬 변수의 초기값 그리고 메소드의 매개값으로 대입해보세요.

	
	*/
}