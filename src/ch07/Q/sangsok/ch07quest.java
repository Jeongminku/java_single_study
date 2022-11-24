package ch07.Q.sangsok;

public class ch07quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		1. 자바의 상속에 대한 설명 중 틀린 것은 무엇입니까? 
		답: 1
				➊ 자바는 다중 상속을 허용한다.
				➋ 부모의 메소드를 자식 클래스에서 재정의(오버라이딩)할 수 있다.
				➌ 부모의 private 접근 제한을 갖는 필드와 메소드는 상속의 대상이 아니다.
				➍ final 클래스는 상속할 수 없고, final 메소드는 오버라이딩할 수 없다.

		2. 클래스 타입 변환에 대한 설명 중 틀린 것은 무엇입니까?
		답: 2
		부모객체가 자식타입으로 선언된 뒤에 자식타입으로 변환할 경우만 가능하다.
		자동타입변환이 먼저 이루어진 경우에만 강제타입변환 할 수 있음.
				➊ 자식 객체는 부모 타입으로 자동 타입 변환된다.
				➋ 부모 객체는 어떤 자식 타입으로도 강제 타입 변환된다.
				➌ 자동 타입 변환을 이용해서 필드와 매개변수의 다형성을 구현한다.
				➍ 강제 타입 변환 전에 instanceof 연산자로 변환 가능한지 검사하는 것이 좋다.

		3. final 키워드에 대한 설명으로 틀린 것은 무엇입니까?
		답: 1
		final = 최최종 = 바뀌지않을것.
				➊ final 클래스는 부모 클래스로 사용할 수 있다.
				➋ final 필드는 초기화된 후에는 변경할 수 없다.
				➌ final 메소드는 재정의(오버라이딩)할 수 없다.
				➍ static final 필드는 상수를 말한다.

		4. 오버라이딩(Overriding)에 대한 설명으로 틀린 것은 무엇입니까?
		답: 4
		protected = 상속 |or| 같은 패키지에 있으면 재정의 가능하다.  
				➊ 부모 메소드의 시그너처(리턴 타입, 메소드명, 매개변수)와 동일해야 한다.
				➋ 부모 메소드보다 좁은 접근 제한자를 붙일 수 없다.(예: public (부모)  private (자식) ).
				➌ @Override 어노테이션을 사용하면 재정의가 확실한지 컴파일러가 검증한다.
				➍ protected 접근 제한을 갖는 메소드는 다른 패키지의 자식 클래스에서 재정의할 수 없다.

		5. 추상 클래스에 대한 설명으로 틀린 것은 무엇입니까?
		답: 2  
		추상클래스는 일반메소드, 추상메소드를 전부 가질 수 있으며, 추상메소드를 반드시 가질 필요는 없다.
				➊ 직접 객체를 생성할 수 없고, 상속만 할 수 있다.
				➋ 추상 메소드를 반드시 가져야 한다.
				➌ 추상 메소드는 자식 클래스에서 재정의(오버라이딩)할 수 있다.
				➍ 추상 메소드를 재정의하지 않으면 자식 클래스도 추상 클래스가 되어야 한다
		
				
				
				
				
				
				
		6. Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성했는데, 
		Child 생성자에서 컴파일에러가 발생했습니다. 그 이유와 해결 방법을 설명해보세요.

		public class Parent {
			public String name;
			public Parent(String name {
				this.name = name;
			} 
		}
		
		public class Child extends Parent {
			public int studentNo;
			
			public Child(String name, int studentNo) {
				this.name = name;
				this.studentNo = studentNo;
			}
		}
		
		부모 클래스의 생성자가 명시적 생성자일 경우, ===> Parent (String name){}
		컴파일러가 자식 클래스 인스턴스 생성 시 자동으로 부모 클래스를 생성할 수 없다. ===> 자동생성은 Parent(){} 이기 때문.
		따라서 자식 클래스에서는 부모 클래스의 생성자를 명시해줘야 하므로 위 코드는 아래와 같이 바뀌어야 한다.
		
		부모 클래스것을 가져오기위해서 super(name)을 작성하여 부모클래스에 적힌 생성자만큼 가져오고,
		추가로 작성하고싶은것을 작성해야.
		public Child(String name, int studentNo){
			super(name); // 부모 생성자 호출
			this.studentNo = studentNo;
		}
		
		
		
		
		
		
		
		
		7. 		Parent 클래스를 상속받아 Child 클래스를 다음과 같이 작성했습니다.
				ChildExample 클래스를 실행했을 때 호출되는 각 클래스의 생성자의 순서를 생각하면서 출력 결과를 작성해보세요.
		
		Parent(String nation) call
			Parent() call
				Child(String name) call
					Child07() call

1.Child객체를 생성 
2.Child클래스가 Parent클래스를 상속받고 있으므로 Parent 생성자로 먼저 초기화를 진행
3.그래서 기본 생성자를 수행하는 도중 this()를 만나서 Parent(String nation)을 먼저 수행. 다음에 Parent()를 수행.
4.그리고 Child 생성자를 수행하는데 여기서도 기본 생성자인 Child() 에서 this("홍길동") 를 부르기 때문에 Child(String name) 호출 후 Child()를 수행.
		
		
		
		
		
		
		8. 		Tire 클래스를 상속받아 SnowTire 클래스를 다음과 같이 작성했습니다. 
				SnowTireExample	클래스를 실행했을 때 출력 결과를 작성해보세요.








		9. 		A, B, C, D, E, F 클래스가 다음과 같이 상속 관계에 있을 때
				 	<- D
					<- B <- E
				A
		 		<- C <- F
		 		
		다음 빈칸에 들어올 수 없는 코드를	선택하세요. 

		//변수 대입
		B b = 빈칸
		
		//메소드 선언
		 void method(B b) { ... }
		 
		//메소드 호출
		 method(빈칸)
		 
		 ➊ new B( ) //본인
		 정답: ➋ (B) new A( )  //강제타입변환
		 ➌ new D( ) //자동타입변환
		 ➍ new E( ) //자동타입변환
		 
		 부모 클래스가 자식 클래스로 강제타입 변환하려면, 
		 부모 클래스가 자식 클래스로 타입 변환이 된 적이 있어야한다. ==> 강제타입변환을 하기위해서는 자동타입변환이 먼저 이루어져야함.
		 이를 위해 instanceof 등을 사용하여 확인함.
		
		 하지만 위와 같을 경우 new A()로 완전히 새로운 객체를 참조하도록 하기 때문에 강제 타입이 불가능하다.
		 만약 2번과 같은 경우가 가능해지려면, 아래와 같이 선언되어야 한다
		 
		 A a = new b();
		 B b = (B) a;
		 
		 10. 		다음과 같이 작성한 Computer 클래스에서 컴파일 에러가 발생했습니다. 
		 		그 이유를 설명해보세요.


		 public abstract class Machine {
		 	public void powerOn() {}
		 	public void powerOff() {}
		 	public abstract void work();
		 }
		 
		 public class Computer extends machine {
		 }
		 
		 컴파일 에러가 난 이유는
		 상속한 부모클래스가 추상클래스이며, 그중에서도 추상클래스가 안에서 추상 메소드를 정의하고있다.
		 추상메소드를 가진 추상클래스를 상속한 경우, 자식클래스에서는 반드시 추상메소드를 재정의(override)해야하는 약속이 있다.
		 그러나, 위에서는 자식클래스에서 부모클래스의 추상메소드를 정의하지 않았으므로, 컴파일에러가 발생한 것이다. 







		11. 		MainActivity의 onCreate( )를 실행할 때 Activity의 onCreate( )도 실행시키고 싶습니다.
					밑줄에 들어갈 코드를 작성해보세요.
	
					super.onCreate();
					
				
					
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
