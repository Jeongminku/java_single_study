package Nov4.Polymorphism;

public class Jururu implements Introduce{
	
	@Override
	public void start() {
		System.out.println("밍나~ 콘르르 콘르르!");
		
	}
	
	@Override
	public void memberName() {
		System.out.println("멤버 이름: 주르르");
		
	}

	@Override
	public void fandom() {
		System.out.println("팬덤 이름: 주폭도");
		
	}

	@Override
	public void song() {
		System.out.println("대표곡: Ju. T'aime");
		
	}

	@Override
	public void youtubeSub() {
		System.out.println("유튜브구독자: 19.2만명");
		
	}


}
