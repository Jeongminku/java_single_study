package ch12.genericQ;

public class ContainerEX3 {

	public static void main(String[] args) {
		Container3<String, String> container1 = new Container3<String, String>();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		System.out.println(name1);
		String job = container1.getValue();
		System.out.println(job);
		
		Container3<String, Integer> container2 = new Container3<String, Integer>();
		container2.set("홍길동", 35);;
		String name2 = container2.getKey();
		System.out.println(name2);
		int age = container2.getValue();
		System.out.println(age);
	}

}
/*
3. 
ContainerExample 클래스의 main ( ) 메소드는 Container 제네릭 타입을 사용하고 있습니다.
main( ) 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.

*/