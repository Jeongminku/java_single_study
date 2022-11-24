package ch08.Interface.Q;

public class TV5 implements TvRemocon5 {

	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
		
	}

	public static void main(String[] args) {
		TvRemocon5 r = new TV5();
		r.powerOn();

	}


}
