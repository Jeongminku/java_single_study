package ch06.sec06.exam01;

public class CarEX {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car ();
		System.out.println("모델명: " + myCar.model); //String model 초기값 = null
		System.out.println("스피드: " + myCar.speed); //int speed 초기값 = 0
		System.out.println("스타트: " + myCar.start); //Boolean start 초기값 = false
		System.out.println("모델명: " + myCar.model2); //String model 값 을 주었음
		System.out.println("스피드: " + myCar.speed2); //int speed 값을 주었음
		System.out.println("스타트: " + myCar.start2); //Boolean start 값을 주었음 = false
		
		System.out.println("맥스스피드: " + myCar.maxspeed2);
		
		myCar.maxspeed2 = 10000;
		System.out.println("변경된 맥스스피드: " + myCar.maxspeed2);
	}

}
