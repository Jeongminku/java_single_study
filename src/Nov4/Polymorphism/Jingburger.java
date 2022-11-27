package Nov4.Polymorphism;

public class Jingburger implements Introduce{

	@Override
	public void start() {
		System.out.println("당신은 오늘 햄버거를 먹어야합니다");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 징버거");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 똥강아지");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: How To Love(O.Y.T)");
		
	}

	@Override
	public void youtubeSub() {
		System.out.println("유튜브구독자: 21.7만명");
		
	}


}
