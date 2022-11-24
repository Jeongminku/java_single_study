package ch07.Q.sangsok;

public class SnowTireEX {

	public static void main(String[] args) {
		SnowTire08 snowTire = new SnowTire08();
		Tire08 tire = snowTire;
		
		snowTire.run();   //스노우 타이어가 굴러갑니다 가 나옴.
		//snowTire를 불렀으니 당연하게 snowTire가 나옴.
		
		tire.run(); // 스노우 타이어가 굴러갑니다 가 나옴.
		//이유 : 자동타입변환 되었음.
		//tire 객체를 sonwTire객체로 생성했으므로.오버라이딩 된 snowTire가 나옴.
	}

}
