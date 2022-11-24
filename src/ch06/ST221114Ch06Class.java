package ch06;


public class ST221114Ch06Class {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. 객체와 클래스에 대한 설명으로 틀린 것은 무엇입니까? 
		답 3 // 하나의 클래스(청사진)으로부터 여러개의 객체를 만들 수 있다.
				➊ 클래스는 객체를 생성하기 위한 설계도(청사진)와 같은 것이다.
				➋ new 연산자로 클래스의 생성자를 호출함으로써 객체가 생성된다.
				➌ 하나의 클래스로 하나의 객체만 생성할 수 있다.
				➍ 객체는 클래스의 인스턴스이다.

		
		2. 클래스의 구성 멤버가 아닌 것은 무엇입니까? 
		답 4 
		클래스 구성멤버 : 필드, 생성자, 메소드
		로컬변수 : 생성자와 메소드 {중괄호 블록 내부에 선언된 변수}
				➊ 필드(field )
				➋ 생성자(constructor )
				➌ 메소드(method)
				➍ 로컬 변수(local variable )

		3. 필드, 생성자, 메소드에 대한 설명으로 틀린 것은 무엇입니까?
		답 : 4
		클래스의 구성멤버들은 생략되거나 복수 개가 작성 될 수 있
				➊ 필드는 객체의 데이터를 저장한다.
				➋ 생성자는 객체의 초기화를 담당한다.
				➌ 메소드는 객체의 동작 부분으로, 실행 코드를 가지고 있는 블록이다.
				➍ 클래스는 반드시 필드와 메소드를 가져야 한다.

		4. 필드에 대한 설명으로 틀린 것은 무엇입니까?
		답 : 3
		필드 선언은 클래스 중괄호{   } 블록 어디서든 존재할 수 있다.
		생성자 선언과 메소드 선언의 앞과 뒤 어느곳에서든 필드 선언이 가능하다.
				➊ 필드는 메소드에서 사용할 수 있다.
				➋ 인스턴스 필드 초기화는 생성자에서 할 수 있다.
				➌ 필드는 반드시 생성자 선언 전에 선언되어야 한다.
				➍ 필드는 초기값을 주지 않더라도 기본값으로 자동 초기화된다.
		

		5. 생성자에 대한 설명으로 틀린 것은 무엇입니까?
		★ 답 : 1    오답 : 4번
		생성자를 실행시키지 않고는 클래스로부터 객체를 만들 수 없다.
		만약 생성자가 성공적으로 실행되지 않고 예외(에러)가 발생했다면, 객체는 생성되지 않는다.
				➊ 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다.
				➋ 생성자는 다른 생성자를 호출하기 위해 this ( )를 사용할 수 있다.
				➌ 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다.
				➍ 외부에서 객체를 생성할 수 없도록 생성자에 private 접근 제한자를 붙일 수 있다.

		6. 메소드에 대한 설명으로 틀린 것은 무엇입니까?
		답 : 4
		메소드 오버로딩이 가능
		메소드 오버로딩 조건
			1. 메소드의 이름이 같아야 합니다.
			2. 메소드의 시그니처, 즉 매개변수의 개수 또는 타입이 달라야 합니다
				➊ 리턴값이 없는 메소드는 리턴 타입을 void로 해야 한다.
				➋ 리턴 타입이 있는 메소드는 리턴값을 지정하기 위해 반드시return 문이 있어야 한다.
				➌ 매개값의 수를 모를 경우 “…”를 이용해서 매개변수를 선언할 수 있다.
				➍ 메소드의 이름은 중복해서 선언할 수 없다.

		7. 메소드 오버로딩에 대한 설명으로 틀린 것은 무엇입니까?
		답 : 2
		메소드 오버로딩의 조건에 리턴타입은 들어가지 않는다.
				➊ 동일한 이름의 메소드를 여러 개 선언하는 것을 말한다.
				➋ 반드시 리턴 타입이 달라야 한다.
				➌ 매개변수의 타입, 수, 순서를 다르게 선언해야 한다.
				➍ 매개값의 타입 및 수에 따라 호출될 메소드가 선택된다.

		★ 8. 인스턴스 멤버와 정적 멤버에 대한 설명으로 틀린 것은 무엇입니까?
		답 : 2
		인스턴스 멤버 : 객체(인스턴스)를 생성한 후 사용할 수 있는 필드와 메소드.
		인스턴스 필드와 메소드는 객체(인스턴스)에 소속된 멤버이기때문에 객체 없이는 사용할 수 없음.
		
		정적 멤버 : '고정된', 정적 멤버는 클래스에 고정된 멤버.
		객체를 생성하지 않고 사용할 수 있는 필드와 메소드.
				➊ 정적 멤버는 static으로 선언된 필드와 메소드를 말한다.
				➋ 인스턴스 필드는 생성자 및 정적 블록에서 초기화될 수 있다.
				➌ 정적 필드와 정적 메소드는 객체 생성 없이 클래스를 통해 접근할 수 있다.
				➍ 인스턴스 필드와 메소드는 객체를 생성하고 사용해야 한다.



		★ 9. final 필드와 상수(static final)에 대한 설명으로 틀린 것은 무엇입니까?
		답 : 2
		final을 가장 많이 사용하는 곳은 필드(전역변수) 이다.
		final을 필드에 사용하면 '그 필드는 더이상 수정이 불가능' 하다는 의미.
		따라서 final 필드는 인스턴스 전역에서 값을 수정할 필요가 없는 동일한 데이터를 가져야 할 때 사용.
		인스턴스를 생성하지 않고 고정된 값(상수)을 쉽게 호출하여 사용할 수 있기 때문에 주로 같이 쓰인다.		
				➊ final 필드와 상수는 초기값이 저장되면 값을 변경할 수 없다.
				➋ final 필드와 상수는 생성자에서 초기화될 수 있다.
				➌ 상수의 이름은 대문자로 작성하는 것이 관례이다.
				➍ 상수는 객체 생성 없이 클래스를 통해 사용할 수 있다.




		10. 패키지에 대한 설명으로 틀린 것은 무엇입니까?
				➊ 패키지는 클래스들을 그룹화시키는 기능을 한다.
				➋ 클래스가 패키지에 소속되려면 패키지 선언을 반드시 해야 한다.
				➌ import 문은 다른 패키지의 클래스를 사용할 때 필요하다.
				➍ com.mycom 패키지에 소속된 클래스는 com.yourcom에 옮겨 놓아도 동작한다.





		11. 접근 제한에 대한 설명으로 틀린 것은 무엇입니까?
		답 : 3
		default 접근 제한자는 같은 패키지에 소속된 클래스에서만 사용할 수 있는 멤버를 만든다.
				➊ 접근 제한자는 클래스, 필드, 생성자, 메소드의 사용을 제한한다.
				➋ public 접근 제한은 아무런 제한 없이 해당 요소를 사용할 수 있게 한다.
				➌ default 접근 제한은 해당 클래스 내부에서만 사용을 허가한다.
				➍ 외부에서 접근하지 못하도록 하려면 private 접근 제한을 해야 한다.
		

		12. 다음 클래스에서 해당 멤버가 필드, 생성자, 메소드 중 어떤 것인지( ) 안에 적어보세요.
		public class Member {
   			private String name;                                 --> (필드)
   			public Member(String name) { … }                     —-> (생성자)
   			public void setName(String name) { … }               —-> (메소드)
		}

	
		13. 현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로는 이름, 아이디,    
        패스워드, 나이가 있습니다. 이 데이터들을 가지는 Member 클래스를 선언해보세요.
        데이터 이름	필드 이름	 	타입
        이름			name		문자열
        아이디		id			문자열
        패스워드		password	문자열
        나이			age			정수
        
        class Member {
			String name;
			String id;
			String password;
			int age;		
		}
        
        
      	14. 13번 문제에서 작성한 Member 클래스에 생성자를 추가하려고 합니다. 
      	다음과 같이 name 필드와 id 필드를 외부에서 받은 값으로 초기화하도록 생성자를 선언해보세요.
		Member user1 = new Member("홍길동", "hong");
		
		class Member {
			String name;
			String id;
			String password;
			int age;
		
		Member(String name, String id){
	        this.name = name;
	        this.id = id;
	        }
		}
		
		
		15. login ( ) 메소드를 호출할 때에는 매개값으로 id와 password를 제공하고, logout ( ) 메소드는 
         id만 매개값으로 제공하려고 합니다. 다음 조건과 예제 코드를 보고 MemberService 클래스에서 
         login ( ), logout ( ) 메소드를 선언해보세요.
         
        	➊ login ( ) 메소드는 매개값 id가 "hong", 매개값 password가 "12345" 일 경우에만 true로 리턴
			➋ logout ( ) 메소드는 id + "님이 로그아웃 되었습니다"가 출력되도록 할 것
         
         리턴 타입		메소드 이름		매개변수(타입)
         boolean		login			id(String), password(String)
         void			logout			id(String)
         
        MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");

		if(result) {
     		System.out.println("로그인 되었습니다.");
     		memberService.logout("hong");
		} else {
     		System.out.println("id 또는 password가 올바르지 않습니다.");
		}



		class MemberService {
			boolean login(String id, String password) {
				if(id.equals("hong")&& password.equals("12345")){
					return true;
					System.out.println("로그인 되었습니다.");
				} else {
					return false;
					System.out.println("id 또는 password가 올바르지 않습니다.");
				}
			}
		
			void logout(String id) {
				System.out.println("로그아웃되었습니다.");
			}
			
		}
		
		
		16. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버 중에 static을 붙여야    
            하는 것은 어떤 것들이고 그 이유는 무엇인가? (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
	
	class Marine {
      int x=0, y=0; // Marine의 위치좌표(x,y)
      int hp = 60; // 현재 체력
      static int weapon = 6; // 공격력
      static int armor = 0; // 방어력

      static void weaponUp() {
          weapon++;
     }
      static void armorUp() {
          armor++;
      }
     void move(int x, int y) {
          this.x = x; // this.x는 인스턴스 변수, x는 지역변수
          this.y = y; // this.y는 인스턴스 변수, y는 지역변수
     }
}



		17. 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
		답 : 2,3,4
		1번은 int값으로 서로 같으므로 뒤의 영문을 바꿔봤자 똑같은 취급.
		long add(int a, int b) { return a+b;}
		
			➊ long add(int x, int y) { return x+y;}
    		➋ long add(long a, long b) { return a+b;}
    		➌ int add(byte a, byte b) { return a+b;}
    		➍ int add(long a, int b) { return (int)(a+b);}

		 
		18. 다음 코드를 실행하면 컴파일 에러가 발생한다. 에러가 발생하는 이유를 설명하시오
				class Example {
			int iv = 10;
			static int cv = 20;
			int iv2 = cv;
			static int cv2 = iv; // 라인 A - 컴파일 에러     --- static변수의 초기화에 인스턴스변수를 사용할 수 없다.
			
			static void staticMethod1() {
				System.out.println(cv);
				System.out.println(iv); // 라인 B - 컴파일 에러 --- 스태틱 메소드에 인스턴스변수를 사용할 수 없다.
			}
			
			void instanceMethod1() {
				System.out.println(cv);
				System.out.println(iv); // 라인 C
			}
			
			static void staticMethod2() {
				staticMethod1();
				instanceMethod1(); // 라인 D - 컴파일 에러 --- 스태틱 메소드에 인스턴스 메소드를 사용할 수 없다.
			}
			
			void instanceMethod2() {
				staticMethod1(); // 라인 E
				instanceMethod1();
			}
			
		}
		
		
		
		
		19. Tv클래스를 주어진 로직대로 완성하시오. 
			완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인할 것.

	*/



		
		
	}
}