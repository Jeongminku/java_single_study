package ch07.Q.sangsok;

public class ChildEx07 {

	public static void main(String[] args) {
		Child07 child = new Child07();

	}

}
/*
1.Child객체를 생성 
2.Child클래스가 Parent클래스를 상속받고 있으므로 Parent 생성자로 먼저 초기화를 진행
3.그래서 기본 생성자를 수행하는 도중 this()를 만나서 Parent(String nation)을 먼저 수행. 다음에 Parent()를 수행.
4.그리고 Child 생성자를 수행하는데 여기서도 기본 생성자인 Child() 에서 this("홍길동") 를 부르기 때문에 Child(String name) 호출 후 Child()를 수행.
*/