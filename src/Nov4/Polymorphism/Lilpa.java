package Nov4.Polymorphism;

public class Lilpa implements Introduce{
	
	@Override
	public void start() {
		System.out.println("에블바리 세이~ 리라리라~!");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 릴파");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 박쥐");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: 마지막 재회");
		
	}

	@Override
	public void youtubeSub() {
		System.out.println("유튜브구독자: 22.8만명");
		
	}


}
