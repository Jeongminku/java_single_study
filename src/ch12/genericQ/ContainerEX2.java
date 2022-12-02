package ch12.genericQ;

public class ContainerEX2 {

	public static void main(String[] args) {
		Container2<String> container1 = new Container2<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container2<Integer> container2 = new Container2<Integer>();
		container2.set(6);
		int value = container2.get();
	}

}
