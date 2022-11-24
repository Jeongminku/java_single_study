package ch07.Q.sangsok;

public class Child07 extends Parent07 {
	public String name;
	
	public Child07() {
		// super();  컴파일 시 자동 생성 (부모생성자 호출) -> Parent07()
		this("홍길동");
		System.out.println("Child07() call");
	}

	public Child07(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}


}
